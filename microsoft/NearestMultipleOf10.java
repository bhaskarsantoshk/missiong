package microsoft;
import java.util.Scanner;

public class NearestMultipleOf10 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t!=0){
            String s= in.nextLine();
            int a[]= new int[s.length()];

            for(int i=0;i<a.length;i++){
                a[i] =Integer.parseInt(s.charAt(i)+"");
            }

       
            ifif(a[a.length-1]<=5 ){
                a[a.length-1]=0;
                printArray(a);
            }
            else{
                int[] result = addNumToArray(a,10-a[a.length-1]);
                printArray(result);
            }
            t--;
        }
    }
    static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static int[] addNumToArray(int[] a, int x){
        int i=a.length-1;
        int carry =x;
        while(i>=0){
            int sum= carry + a[i];
            a[i] = sum % 10;
            carry = sum/10;
            i--;
        }

        if(carry == 1){
            a[0] = 10+a[0];
        }
        return a;
    }
}
