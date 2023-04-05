import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 8, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("Dog", "Dog", "sword", "Alarm", "alarm"));

        System.out.println("1 Task");
        System.out.println(collectOdd(nums));
        System.out.println("2 Task");
        System.out.println(collectOddInAscendOrder(nums));
        System.out.println("3 Task");
        System.out.println(collectUniqWords(words));
        System.out.println("4 Task");
        System.out.println(collectRepeats(words));
    }

    public static List<Integer> collectOdd(List<Integer> list) {
        List<Integer> outputList = new ArrayList<>();
        for (Integer number : list) {
            if (number % 2 != 0) {
                outputList.add(number);
            }
        }
        return outputList;
    }

    public static Set<Integer> collectOddInAscendOrder(List<Integer> list) {
        Set<Integer> outputList = new TreeSet<>();
        for (Integer number : list) {
            if (number % 2 == 0) {
                outputList.add(number);
            }
        }
        return outputList;
    }

    public static Set<String> collectUniqWords(List<String> list) {
        Set<String> outputList = new HashSet<>();
        for (String word : list) {
            outputList.add(word);
        }
        return outputList;
    }

    public static HashMap<String, Integer> collectRepeats(List<String> list) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        for (String word : list) {
            if (hashmap.containsKey(word)) {
                hashmap.replace(word, hashmap.get(word) + 1);
            } else {
                hashmap.put(word, 1);
            }
        }
        return hashmap;
    }

}