
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthMapping {
    
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("arun","Akash","Ajaykumar");

        List<Integer> leng = list.stream()
        .map(String::length)
        .collect(Collectors.toList());

        System.out.println(leng);
    }
}