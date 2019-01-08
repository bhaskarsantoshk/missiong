package missiong.codechef;
import java.util.HashMap;
import java.util.Scanner;

/*
https://www.codechef.com/OCT18B/problems/BITOBYT

 */

public class BITOBYT {

    public static void main(String[] args){
        int i= 0;
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(0,"b 1");
        int j=1;
        String s= "b";
        while ( i <= 1700){
            i+=3;
            s="N "+Integer.toString(j);
            hm.put(i, s);
            i+=9;
            s="B "+Integer.toString(j);
            hm.put(i, s);
            i+=17;
            j*=2;
            s="b "+Integer.toString(j);
            hm.put(i,s);
        }

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        while(t!=0){
            int n=in.nextInt();
            while (!hm.containsKey(n)){
                n--;
            }
           String result="";
            String str[]= hm.get(n).split(" ");
            if (str[0].equals("b")) result=str[1]+" 0 0 ";
            else if (str[0].equals("N")) result="0 "+str[1]+" 0 ";
            else result="0 0 "+str[1]+" ";
            System.out.println(result);
            t--;
        }
    }
}
