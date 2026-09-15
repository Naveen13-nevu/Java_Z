
import java.util.Arrays;
import java.util.List;


public class Count {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(5,6,7,20,12,15);

        long count = list.stream()
        .filter(n-> n>10)
        .count();

        System.out.println(count);
    }
}
