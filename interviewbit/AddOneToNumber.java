package missiong.interviewbit;

import java.util.ArrayList;
import java.util.Collections;

//import static favoriteportal.Array.printArray;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int len = A.size();
        int sum = A.get(len-1) + 1;
        int carry = sum / 10;
        A.remove(len-1);
        A.add(len-1, sum%10);
        for(int i=len-2;i>=0;i--){
            sum = A.get(i) + carry;
            carry = sum / 10 ;
            A.remove(i);
            A.add(sum%10);
        }
        if(carry==1){
            A.add(0, 1);
        }
       // System.out.println(A);
        Collections.reverse(A);
        return A;

    }

    public int[] plusOne(int[] A) {
        int len = A.length;
        int sum = A[len-1] + 1;
        int carry = sum / 10;

        A[len-1] = sum % 10;

        for(int i= len-2 ; i>=0;i--){
            sum = A[i] + carry;
            carry =sum / 10;
            A[i] = sum % 10;
        }

        if(carry == 1){
            int result[]= new int[A.length+1];
            result[0] = 1;
            for(int i=1;i<result.length;i++){
                result[i] = A[i-1];
            }
            return result;
        }
        int index = 0;
        for(int i=0;i<A.length;i++){
            index = i;
            if(A[i]!=0){
                index= i-1;
                break;
            }
        }

        if(index>=0){
            int size = A.length-index-1;
            int result[] = new int[size];
            for(int i=0;i<result.length;i++){
                result[i] = A[index+1];
                index++;
            }

            return result;
        }

        return A;
    }

    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        //System.out.println((new AddOneToNumber()). plusOne(al));
        int a[]= {0, 3, 7, 6, 4, 0, 5, 5, 5 };
        printArray((new AddOneToNumber()).plusOne(a));
    }

    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
