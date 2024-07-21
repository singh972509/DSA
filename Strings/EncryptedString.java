package Strings;

public class EncryptedString {
    public static void main(String[] args) {
        String s=getEncryptedString("dart",3);
    }
    public static String getEncryptedString(String s, int k) {
        char[] ch=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((i+3)>=s.length()){
                int index=i+3-k-1;
                sb.append(ch[index]);
            }
            else{
                sb.append(ch[i+3]);
            }
        }
        return sb.toString();
    }
}
