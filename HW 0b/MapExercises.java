import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    public static void main(String[] args) {
        char letter1 = 'a';
        char letter2 = 'd';
        char letter3 = 'z';
        System.out.println(letter1 + " maps to: " + letterToNum(letter1));
        System.out.println(letter2 + " maps to: " + letterToNum(letter2));
        System.out.println(letter3 + " maps to: " + letterToNum(letter3));

        // Test squares method
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Map<Integer, Integer> squaresMap = squares(nums);
        System.out.println("Squares of numbers: " + squaresMap);

        // Test countWords method
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> wordCountMap = countWords(words);
        System.out.println("Word count: " + wordCountMap);
    }
    public static Integer letterToNum(char c ){
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);
        return map.get(c);
    }
    public static Map<Integer,Integer> squares(List<Integer> nums ){
        int index =0;
        Map<Integer,Integer> square =new HashMap<>();
        for( int one : nums){
            index = one * one;
            square.put(one,index);
        }
        return square;
    }
    public static Map<String,Integer> countWords(List<String> words){
        Map<String,Integer>countwords =new HashMap<>();
        for(String one : words){
            if(countwords.containsKey(one)){
                int value =countwords.get(one)+1;
                countwords.put(one, value);
            }
            else{
                countwords.put(one,1);
            }
        }
        return countwords;
    }
}
