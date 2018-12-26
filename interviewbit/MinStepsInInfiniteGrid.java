package missiong.interviewbit;

import java.util.ArrayList;

public class MinStepsInInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int distance = 0;
        //Starting Point
        int x= A.get(0);
        int y=B.get(0);
        for(int i=1;i<A.size();i++){
            int shortest_distance_a_b = Math.max (Math.abs(x-A.get(i)), Math.abs(y-B.get(i)));
            distance+=shortest_distance_a_b;
            x=A.get(i);
            y=B.get(i);
        }

        return distance;
    }
}
