
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FrequencySort {
    
    public static void main(String[] args) {
        
        String str = "aabbccccdddeeeeeee";

        Map<Character,Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);

        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());
        
        for(Map.Entry<Character,Integer> entry : list){
            System.out.println(entry.getKey()+" = "+ entry.getValue());
        }

    }
}
