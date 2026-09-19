
import java.util.HashSet;

public class LongestConsecutives {

    public static int Cons(int arr[]){

        HashSet<Integer> set = new HashSet<>();
        int maxlength =0;

        for(int num : arr){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int length = 1;

                while(set.contains(current + 1)){
                    current++;
                    length++;
                }
                if(length > maxlength){
                    maxlength = length;
                }
            }
        }

        return  maxlength;
    }
    

    public static void main(String[] args) {
        
        int arr[] = {1,2,100,200,3,4,5};

        int result = Cons(arr);
        System.out.println(result);

    }
}
