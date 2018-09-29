package leetcode;

public class P796RotateString {
    public boolean rotateString(String A, String B) {
        return ( (A.length() == B.length()) && (A+A).indexOf(B)>=0 );
    }
}