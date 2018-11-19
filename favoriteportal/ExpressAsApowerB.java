package missiong.favoriteportal;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExpressAsApowerB {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static void jsutLikeThat() throws IOException {
        String x = br.readLine();
    }

    static Set<Long> set = new HashSet<Long>();
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ExpressAsApowerB obj= new ExpressAsApowerB();
        obj.generatePowers();
        int t=Integer.parseInt(br.readLine());
        OutputStream out = new BufferedOutputStream( System.out );
        while (t!=0){
            long n = Long.parseLong(br.readLine());
            String s= "";

            if(set.contains(n)){
                out.write("Yes\n".getBytes());
            }
            else{
                out.write("No\n".getBytes());
            }
            t--;
        }
        out.flush();
    }

    private static void generatePowers() {
        for(long i=2;i<=10000;i++){
            long x= i;
            while(x<=100000000){
                x*=i;
                set.add(x);
            }
        }

      //  System.out.println(set.size());
    }

    private void isPower(int n) {
        for (int i=2 ; i<=Math.sqrt(n); i++){
            int x=i;

            while (x<=n){
                x = x*i;
                if(x==n){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

}
