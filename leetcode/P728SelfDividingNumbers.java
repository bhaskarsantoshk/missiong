package leetcode;
import java.util.ArrayList;
import java.util.List;

public class P728SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i=left ; i<=right; i++){
            int temp=i;
            boolean flag=true;
            while (temp!=0){
                int digit = temp%10;
                if (digit ==0 ){
                    flag = false;
                    break;
                }
                if (i%digit!=0){
                    flag = false;
                    break;
                }
                temp/=10;
            }

            if(flag==true){
                list.add(i);
            }
        }

        return list;
    }

}
