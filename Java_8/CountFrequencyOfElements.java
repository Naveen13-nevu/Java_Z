import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class CountFrequencyOfElements {
    
    public static void main(String[] args) {
        
        String []words = {"Apple","apple","Banana","Orange","lemon"};

        Map<String,Long> frequency = Arrays.stream(words)
        .collect(Collectors.groupingBy(word -> word,Collectors.counting()));

        System.out.println(frequency);
    }
}
