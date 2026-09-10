
import java.util.PriorityQueue;

public class KthLargestElement {

    public static int largest(int arr[], int key){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int n : arr){
            pq.offer(n);
            if(pq.size()>key){
                pq.poll();
            }
        }
        return pq.peek();
    }
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int key = 2;

        System.out.println(largest(arr, key));

    }
}
