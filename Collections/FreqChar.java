
import java.util.HashMap;


public class FreqChar {

    public static void count(int arr[]){
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n:arr){
                map.put(n, map.getOrDefault(n, 0)+1);
        }
        System.out.print(map);
    }
    
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,2,3,4,5,6,6,6,6};
        count(arr);

    }
}
