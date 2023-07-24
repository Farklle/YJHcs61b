import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExercises {
    public static void main(String[] args) {
                // 测试这些方法
                List<Integer> first = new ArrayList<>();
                first.add(1);
                first.add(2);
                first.add(3);
                first.add(4);
                first.add(5);
                int sum = sum(first);
                System.out.println("Sum: " + sum); // Output: 15
                List<Integer> numbers = new ArrayList<>();
                numbers.add(1);
                numbers.add(2);
                numbers.add(3);
                numbers.add(4);
        
                List<Integer> evenNumbers = evens(numbers);
                System.out.println("Even numbers: " + evenNumbers); // Output: [2, 4]
        
                List<Integer> otherNumbers = new ArrayList<>();
                otherNumbers.add(3);
                otherNumbers.add(4);
                otherNumbers.add(5);
        
                List<Integer> commonElements = common(numbers, otherNumbers);
                System.out.println("Common elements: " + commonElements); // Output: [3, 4]
        
                List<String> words = new ArrayList<>();
                words.add("apple");
                words.add("banana");
                words.add("orange");
                words.add("cherry");
        
                char searchChar = 'a';
                int occurrences = countOccurrencesOfC(words, searchChar);
                System.out.println("Occurrences of '" + searchChar + "': " + occurrences);
    }
    public static Integer sum(List<Integer> list) {
        int sum = 0;
        for (int elem : list) {
            sum += elem;
        }
        return sum;
    }
    public static List<Integer> evens(List<Integer> list) {
        List<Integer> evens = new ArrayList<>();
        if(list.isEmpty()){
            return evens;
        }
        for (int elem : list) {
            if (elem % 2 == 0) {
                evens.add(elem);
            }
        }
        return evens;
    }
    public static List<Integer>common(List<Integer> list1, List<Integer> list2){
        List<Integer> common = new ArrayList<>();
        for(int one : list1){
            if(list2.contains(one)){
                common.add(one);
            }
        }
        return common;
    }
    public static int countOccurrencesOfC(List<String>words ,char c){
        int count=0;
        for(String one : words){
            if(one==String.valueOf(c)){
                count++;
            }
        }
        return count;
    }
}

