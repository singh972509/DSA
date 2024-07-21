package TwoPointer;

import java.util.*;

public class RateLimiter {
    public static void main(String[] args) {
        List<List<String>> requests = Arrays.asList(
                Arrays.asList("www.xyz.com", "0"),
                Arrays.asList("www.abc.com", "1"),
                Arrays.asList("www.xyz.com", "2"),
                Arrays.asList("www.xyz.com", "3"),
                Arrays.asList("www.xyz.com", "4"),
                Arrays.asList("www.xyz.com", "8"),
                Arrays.asList("www.abc.com", "10"),
                Arrays.asList("www.xyz.com", "30"),
                Arrays.asList("www.xyz.com", "31")
        );
        List<String> result = getRequests(requests);
        for (String website : result) {
            System.out.println(website);
        }
    }

    public static List<String> getRequests(List<List<String>> requests) {
        // The result list of accepted requests
        List<String> acceptedRequests = new ArrayList<>();

        // Maps to store request timestamps for each website
        Map<String, Deque<Integer>> shortWindowMap = new HashMap<>();
        Map<String, Deque<Integer>> longWindowMap = new HashMap<>();

        for (List<String> request : requests) {
            String website = request.get(0);
            int timestamp = Integer.parseInt(request.get(1));

            shortWindowMap.putIfAbsent(website, new LinkedList<>());
            longWindowMap.putIfAbsent(website, new LinkedList<>());

            Deque<Integer> shortWindow = shortWindowMap.get(website);
            Deque<Integer> longWindow = longWindowMap.get(website);

            // Remove timestamps outside the short window (5 seconds)
            while (!shortWindow.isEmpty() && timestamp - shortWindow.peekFirst() >= 5) {
                shortWindow.pollFirst();
            }

            // Remove timestamps outside the long window (30 seconds)
            while (!longWindow.isEmpty() && timestamp - longWindow.peekFirst() >= 30) {
                longWindow.pollFirst();
            }

            // Check if the number of requests in the short window exceeds the limit
            if (shortWindow.size() < 2 && longWindow.size() < 5) {
                shortWindow.addLast(timestamp);
                longWindow.addLast(timestamp);
                acceptedRequests.add(website);
            }
        }

        return acceptedRequests;
    }
    }
