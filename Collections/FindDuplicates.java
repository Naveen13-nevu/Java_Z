
import java.util.HashSet;

public class FindDuplicates {

    public static void dup(int arr[]){

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for(int n : arr){
            if(set.contains(n)){
                duplicate.add(n);
            }
            else{
                set.add(n);
            }
        }
        System.out.print(duplicate);
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,3,4,5,5,6,7,7,7};
        dup(arr);

    }
}
