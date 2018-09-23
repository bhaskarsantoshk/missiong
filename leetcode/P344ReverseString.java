package leetcode;

public class P344ReverseString {
    public static void main(String[] args){
        String s= "A man, a plan, a canal: Panama";
        P344ReverseString obj = new P344ReverseString();
        System.out.println(obj.reverseString(s));
    }


    public static String reverseString(String s){
        char[] c=s.toCharArray();
        for (int i=0;i<c.length/2;i++){
            swap(c, i , c.length-i-1);
        }
        return String.copyValueOf(c);
    }

    public static void swap(char []c, int i, int j){
        int temp = c[i];
        c[i]= c[j];
        c[j]= c[i];
    }
}
