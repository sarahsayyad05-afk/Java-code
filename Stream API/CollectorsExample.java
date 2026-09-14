import java.util.*;
import java.util.stream.*;

 class CollectorsExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("C","PHP","Java","C++","Python","C");

        // 1. toList
        List<String> nameList = names.stream().collect(Collectors.toList());
        System.out.println("To List: " + nameList);

        // 2. toSet
        Set<String> nameSet = names.stream().collect(Collectors.toSet());
        System.out.println("To Set (Unique Names): " + nameSet);

        // 3. toMap
        Map<String, Integer> nameLengthMap = names.stream().distinct()
            .collect(Collectors.toMap(  name -> name,            
                                         name -> name.length() ));
        System.out.println("To Map (Name -> Length): " + nameLengthMap);

        // 4. joining
        String joined = names.stream()
            .collect(Collectors.joining(","));
        System.out.println("Joining: " + joined);

        // 5. groupingBy (Group names by length)
        Map<Integer, List<String>> groupedByLength = names.stream()
            .collect(Collectors.groupingBy(x->x.length()));
        System.out.println("Grouped by Length: " + groupedByLength);

        // 6. partitioningBy (Names longer than 4 chars)
        Map<Boolean, List<String>> partitioned = names.stream()
            .collect(Collectors.partitioningBy(name -> name.length() > 4));
        System.out.println("Partitioned (length > 4): " + partitioned);

        // 7. counting
        long count = names.stream()
            .collect(Collectors.counting());
        System.out.println("Total Count: " + count);

        // 8. summarizingInt (on numbers)
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        IntSummaryStatistics stats = numbers.stream()
            .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Stats: " + stats);

        // 9. mapping (inside groupingBy) — map names by their length, get first letter
        Map<Integer, List<Character>> initialsByLength = names.stream()
            .collect(Collectors.groupingBy(
                String::length,
                Collectors.mapping(s -> s.charAt(0), Collectors.toList())
            ));
        System.out.println("Initials grouped by name length: " + initialsByLength);
    }
}