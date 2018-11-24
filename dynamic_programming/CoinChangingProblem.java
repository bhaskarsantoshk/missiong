package missiong.dynamic_programming;

public class CoinChangingProblem {
    public static void main(String[] args) {

        int[] denominations = new int[] {1, 5, 10};
        System.out.println("Combinations (DP): " + solve_coin_change_dp(denominations,356));
    }
    static int solve_coin_change_dp(
            int[] denominations,
            int amount) {
        // TODO: Write - Your - Code
        int result[] = new int[amount+1];
       result[0] = 1;
       for ( int i=0;i<denominations.length;i++){
           for(int j= denominations[i] ; j<=amount;j++){
             result[j] += result[j-denominations[i]];
           }
       }
        return result[amount];
    }
}
