
import java.util.Arrays;
import java.util.List;


public class CountStringStartWithA {
    
    public static void main(String[] args) {
        
        List<String> count = Arrays.asList("Arun","Arul","Lokesh","Jana");

        long counts = count.stream()
        .filter(name -> name.startsWith("A"))
        .count();

        System.out.println(counts);
    }
}
