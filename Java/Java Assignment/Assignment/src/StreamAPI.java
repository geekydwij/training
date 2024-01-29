import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void streamMethods() {
        // Dummy List, Map, and Set for Stream
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape", "banana", "apple");
        Map<Integer, String> integerMap = Stream.of("one", "two", "three", "four")
                .collect(Collectors.toMap(String::length, Function.identity(),(r1, r2) -> r1));
        Set<Integer> integerSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1));
    
        System.out.println("Original List: " + stringList);
        System.out.println("Original Map: " + integerMap);
        System.out.println("Original Set: " + integerSet);
    
        // Find the first non-repeated character in a String using Stream functions
        String inputString = "programming";
        System.out.println("Input String: " + inputString);
        char firstNonRepeated = inputString.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> inputString.indexOf(ch) == inputString.lastIndexOf(ch))
                .findFirst()
                .orElse(' ');
        System.out.println("First non-repeated character: " + firstNonRepeated);
    
        // Find the first repeated character in a String using Stream functions
        char firstRepeated = inputString.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> inputString.indexOf(ch) != inputString.lastIndexOf(ch))
                .findFirst()
                .orElse(' ');
        System.out.println("First repeated character: " + firstRepeated);
    
        // Sort all values in a list of integers using Stream functions
        List<Integer> integerList = Arrays.asList(5, 3, 8, 1, 2, 7, 4, 6);
        System.out.println("Input List: " + integerList);
        List<Integer> sortedList = integerList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted list: " + sortedList);
    
        // Concatenate two Streams
        Stream<String> stream1 = Stream.of("one", "two", "three");
        Stream<String> stream2 = Stream.of("four", "five", "six");
        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);
        System.out.println("Concatenated Stream: " + concatenatedStream.collect(Collectors.toList()));
    
        // Convert a List of objects into a Map, considering duplicated keys and store them in sorted order
        List<String> stringListWithDuplicates = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana");
        Map<String, Integer> stringMap = stringListWithDuplicates.stream()
                .collect(Collectors.toMap(Function.identity(), String::length, (existing, replacement) -> existing, TreeMap::new));
        System.out.println("Map with sorted keys: " + stringMap);
    
        // Count each element/word from the String ArrayList in Java 8
        List<String> wordsList = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana");
        System.out.println("Input Words: " + wordsList);
        Map<String, Long> wordCountMap = wordsList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Word count map: " + wordCountMap);
    
        // Find only duplicate elements with their count from the String ArrayList in Java 8
        Map<String, Long> duplicateWordCountMap = wordsList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Duplicate word count map: " + duplicateWordCountMap);
    
        // Find the Maximum element in an array
        int[] intArray = {5, 3, 8, 1, 2, 7, 4, 6};
        System.out.println("Input Array: " + Arrays.toString(intArray));
        int maxElement = Arrays.stream(intArray).max().orElseThrow(NoSuchElementException::new);
        System.out.println("Maximum element in the array: " + maxElement);
    
        // Print the count of each character in a String
        String inputString2 = "programming";
        System.out.println("Input String: " + inputString2);
        Map<Character, Long> charCountMap = inputString2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Character count map: " + charCountMap);
    }
    
}
