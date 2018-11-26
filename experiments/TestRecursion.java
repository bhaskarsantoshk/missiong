package missiong.experiments;

public class TestRecursion {
    public static void main(String[] args){
        int x= 5;
        recursion(x);
    }

    public static int recursion(int x){
        if(x==0){
            return 0;
        }
        System.out.println(x);
        x=x-1;
        int y= recursion(x);
        int z= recursion(x);
        return Math.max(y,z);
    }
}
