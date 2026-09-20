
import java.util.HashMap;

public class MajorityOfElements {

    public static int major(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int nums : arr){

            int count = map.getOrDefault(nums, 0)+1;
            map.put(nums, count);
            if(count > arr.length/2){
                return nums;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,3,3};
        int result = major(arr);
        System.out.println(result);


    }
}
