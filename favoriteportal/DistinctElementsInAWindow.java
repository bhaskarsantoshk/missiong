package missiong.favoriteportal;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class DistinctElementsInAWindow {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static void jsutLikeThat() throws IOException {
        String x = br.readLine();
    }

    public static void main(String[] args)throws IOException{
        int t= Integer.parseInt(br.readLine());
        while(t!=0){
            String s= br.readLine();
            String str[]= s.split(" ");
            int n = Integer.parseInt(str[0]);
            int k= Integer.parseInt(str[1]);
            int[] arr = readIntegerArrayFromLine();
            printDistinctWindowSizes(arr,n,k);
            t--;
        }
    }

    private static void printDistinctWindowSizes(int[] arr, int n, int k) throws IOException{
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<k; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        OutputStream out = new BufferedOutputStream( System.out );
        out.write((String.valueOf(hm.size())+" ").getBytes());
        int j=0;
        for(int i=k; i<n ; i++){
            if(hm.get(arr[j])==1){
                hm.remove(arr[j]);
            }
            else{
                hm.put(arr[j], hm.get(arr[j])-1);
            }

            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
            j++;

            out.write((String.valueOf(hm.size())+" ").getBytes());
        }
        out.write("\n".getBytes());
        out.flush();

    }

    public static int[] readIntegerArrayFromLine() throws IOException {
        return toIntArrFromStringArr(br.readLine().split(" "));
    }

    public static int[] toIntArrFromStringArr(String[] arr) {
        return Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
    }
}
