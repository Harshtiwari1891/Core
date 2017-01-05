import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordCounter {
	public static void main(String[] args) {
        String text =
            "Can you catch that big fat rat?\n" +
            "If you catch that big fat rat,\n" +
            "You will have some milk for that.\n";
         
        //перечесляем все знаки припинания и так далее
        String delemiters = " \t\n\r\f,.!?—";
        StringTokenizer tokenizer = new StringTokenizer(text, delemiters);
 
        //проходим все слова и считаем
        //TreeMap что бы слова сортировались
        Map<String, Integer> words = new TreeMap<String, Integer>();
        String word;
        Integer count;
        while (tokenizer.hasMoreTokens()) {
            word = tokenizer.nextToken().toLowerCase();
            count = words.get(word);
            count = (count == null) ? 1 : count + 1;
            words.put(word, count);
        }
 
        //на печать
        Set<String> keys = words.keySet();
        for (String key : keys) {
            System.out.println(key + " " + words.get(key));
        }
         
    }


}
