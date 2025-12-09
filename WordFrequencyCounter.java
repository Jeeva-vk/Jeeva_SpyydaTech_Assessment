import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String text = sc.nextLine().toLowerCase();

        text = text.replaceAll("[^a-zA-Z0-9 ]", " ");
        String[] words = text.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (w.isEmpty()) continue;
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        for (var entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
