package Arrays.Hard;

public class MergeOverlappingArrays {
    public static void main(String[] args) {
        int[] nums1= {1, 2, 3, 0, 0, 0};
        int[] nums2={2,5,6};
        merge(nums1, nums1.length,nums2,nums2.length);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(nums2[j]<nums1[i]){
                    nums1[i]=nums2[j];
                    break;
                }
                if(nums1[i]==0){
                    nums1[i]=nums2[j];
                    break;
                }
            }
        }
    }
}
