package random;
import java.util.*;
public class Solution1 {
    List<List<Integer>> optimalUtilization(int maxTravelDist,
                                           List<List<Integer>> forwardRouteList,
                                           List<List<Integer>> returnRouteList)
    {


        List<List<Integer>> result = new ArrayList<List<Integer>>();

        HashMap<Integer,Integer> forwardList = new HashMap<>();
        HashMap<Integer,Integer> returnList = new HashMap<>();

        for ( List<Integer> routeDetails : forwardRouteList  ){
            forwardList.put(routeDetails.get(1), routeDetails.get(0));
        }


        for ( List<Integer> routeDetails : returnRouteList  ){
            returnList.put(routeDetails.get(1), routeDetails.get(0));
        }

        Set<Integer> set = new TreeSet<>();

        for(Integer x: forwardList.keySet()){
            for (Integer y: returnList.keySet()){
                long z= x+y;

                if( (int)z <=maxTravelDist ){
                    set.add((int)z);
                }
            }
        }

        int max = ((TreeSet<Integer>) set).last();

        int q=-101029273;

        for (Integer x: forwardList.keySet()){
            for (Integer y: returnList.keySet()){

                if ( x + y == max){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(x);
                    temp.add(y);
                    result.add(temp);
                }
            }
        }

        return  result;



    }
}
