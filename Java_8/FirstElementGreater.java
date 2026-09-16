import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElementGreater {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,6,7,8,10);

        Optional<Integer> result = list.stream()
        .filter(n -> n>5)
        .findFirst();

        System.out.println(result.orElse(0));

    }
}
