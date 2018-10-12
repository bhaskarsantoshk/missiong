package random;


// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import javafx.print.Collation;

import java.util.Collections;
import java.util.*;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    List<List<Integer>> nearestXsteakHouses(int totalSteakhouses,
                                            List<List<Integer>> allLocations,
                                            int numSteakhouses)
    {
        if ( totalSteakhouses == numSteakhouses){
            return allLocations;
        }
        else if (numSteakhouses == 0){
            return null;
        }

        List<Double> distList = new ArrayList<Double>();
        Map<Double, List<Integer>> map= new HashMap<>();

        for (List<Integer> house: allLocations){
            Double distance = distanceFromCustomer(house.get(0), house.get(1));
            distList.add(distance);
            if(map.containsKey(distance)){
                map.get(distance).add(house.get(0));
                map.get(distance).add(house.get(1));
            }
            else {
                map.put(distance, house);
            }
        }

        Collections.sort(distList);

        List<List<Integer>> result= new ArrayList<List<Integer>>();

        int temp = numSteakhouses;
        int i=0;
        while (temp!=0){
            result.add(map.get(distList.get(i)));

            i++;
            temp--;
        }

        return result;

    }

    public static Double distanceFromCustomer(int x, int y){
        Double d = Math.sqrt ( x*x + y*y);
        return d;
    }
}
