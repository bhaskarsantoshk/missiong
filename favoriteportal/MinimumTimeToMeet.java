package favoriteportal;

import java.util.Scanner;

import static favoriteportal.Array.printArray;

public class MinimumTimeToMeet {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();

        while(t!=0){
            int r=in.nextInt();
            int c=in.nextInt();

            int n=in.nextInt();
            in.nextLine();
            String str[]=new String[r];
            for(int i=0;i<r;i++){
                str[i]=in.nextLine();
            }

            int a[][]=new int[r][c];
            int x=-1;
            for (int i=0 ; i<r; i++){
                for(int j=0;j<c;j++){
                    a[i][j]=Integer.parseInt(str[i].charAt(j)+"");
                    if(a[i][j]==2){
                        a[i][j]=x;
                        x--;
                    }
                }
            }

            printArray(a);

            

            t--;
        }
    }
}
