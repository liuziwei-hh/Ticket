package t;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Tic {
    public static void main(String[] args) {
        String[] price = {"500 300 400 1000"};
        Map<String, Integer> result = new HashMap<>();
        for (String line : price) {
            System.out.println("符合方法的花费;");
            String[] words = line.split(" ");
            for (String word : words) {
                //System.out.println(word);
                if(Integer.valueOf(word)<=500){

                    result.put(word, 1);
                }


            }
        }
        for(Entry entry:result.entrySet()){
            System.out.println(entry.getKey());
        }
    }

}

