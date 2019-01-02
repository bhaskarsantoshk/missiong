package missiong.interviewbit;

public class PalindromeString {
    public static int isPalindrome(String A) {
        int firstIndex = 0;
        int lastIndex = A.length()-1;
        while(firstIndex<=lastIndex){
            char first = A.charAt(firstIndex);
            char last = A.charAt(lastIndex);
            System.out.println(first+" "+last);
            if(valid(first)!=true){
                firstIndex++;
            }
            else if(valid(last)!=true){
                lastIndex--;
            }
            else{
                char lowerFirstIndexChar = lower(first);
                char lowerLastIndexChar = lower(last);

               // System.out.println(firstIndex+" "+lowerLastIndexChar);

                if(lowerFirstIndexChar != lowerLastIndexChar){
                    return 0;
                }
                firstIndex++;
                lastIndex--;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        String s="race a car";
        System.out.println(isPalindrome(s));
    }
    static boolean valid(char ch){
        return numeric(ch) || alphabetic(ch);
    }

    static boolean numeric(char ch){
        return (ch>='0' && ch<='9');
    }
    static boolean alphabetic(char ch){
        return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z');
    }

    static char lower(char ch){
        if(ch>='a' && ch<='z'){
            return ch;
        }

        return (char) ((int)ch - (int)'A' + (int)'a');
    }
}

