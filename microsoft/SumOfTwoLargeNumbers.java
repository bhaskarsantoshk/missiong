package microsoft;
import java.util.*;

public class SumOfTwoLargeNumbers {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();
        while(t!=0){
            String line=in.nextLine();
            String[] starr= line.split(" ");
            int firstArray[] = new int[starr[0].length()];
            int secondArray[] = new int[starr[1].length()];
            int copyOfFirstArray[] = new int[firstArray.length];
            for ( int i = 0 ; i < firstArray.length ; i++){
                firstArray[i]= Integer.parseInt(starr[0].charAt(i)+"");
                copyOfFirstArray[i]=firstArray[i];
            }
            for ( int i = 0 ; i < secondArray.length ; i++){
                secondArray[i]= Integer.parseInt(starr[1].charAt(i)+"");
            }

            if(firstArray.length<secondArray.length){
                print(firstArray);
            }
            else {

          

                int carry = 0;
                int i = firstArray.length - 1;
                int j = secondArray.length - 1;
                while (i >= 0 && j >= 0) {
                    int sum = firstArray[i] + secondArray[j] + carry;
                    carry = sum / 10;
                    firstArray[i] = sum % 10;
                    i--;
                    j--;
                }
                while (i >= 0) {
                    int sum = firstArray[i] + carry;
                    carry = sum / 10;
                    firstArray[i] = sum % 10;
                    i--;
                }

                if (carry == 1) {
                    print(copyOfFirstArray);
                } else {
                    print(firstArray);
                }
            }
            t--;
        }
    }

    static void print(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"");
        }
        System.out.println();
    }
}
