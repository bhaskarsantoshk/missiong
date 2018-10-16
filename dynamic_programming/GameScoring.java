package dynamic_programming;

public class GameScoring {
   public static void main(String[] args) {
        System.out.println("Scoring_Options_Dp(4): "+ scoring_options_dp(4)); //6

        System.out.println( "Scoring_Options_Dp(5): "+ scoring_options_dp(5)); //10
    }
    public static int scoring_options_dp(int n) {

int result[] = new int[n+1];
        result[1] = 1;
        result[2] = 2;
        result[3] = 3;
        result[4] = 6;
        if (n<=4){
            return result[n];
        }
        else{
            for(int i=5;i<=n;i++){
                result[i]= result[i-4] + result[i-2] + result[i-1];
            }
        }
        return result[n];
    }
}
