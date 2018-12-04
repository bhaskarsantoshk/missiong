package missiong.random;

public class BalancingParanthesisMinCost {
    public static void main(String[] args){
        String s= "))((";
       int answer = balancingParanthesisMinCost(s,s.length());
       System.out.println(answer);
    }

    private static int balancingParanthesisMinCost(String s, int length) {
        if(canBeBalanced(s)==false){
            return -1;
        }
        int result[] = new int[length];
        result[0] = (s.charAt(0)=='(') ? -1 : 1;
        int answer=0;
        answer+=result[0];
        for (int i=1;i<length;i++){
            result[i] = (s.charAt(i)=='(') ? result[i-1]-1 : result[i-1]+1;
            answer+=result[i];
        }
        return Math.abs(answer);
    }

    private static boolean canBeBalanced(String s) {
        int openingBraces = 0;
        int closingBraces = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                openingBraces++;
            }
            else{
                closingBraces++;
            }
        }
        return (openingBraces==closingBraces);
    }
}
