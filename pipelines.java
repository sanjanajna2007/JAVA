import java.util.*;
public class pipelines {
    public static void main(String[] args) {
        // set
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers);

        // list
        // ArrayList<String> names = new ArrayList<>();
        // names.add("sanjuu");
        // names.add("mahii");
        // names.add("sanjuu");
        // System.out.println(names);

        List<Integer> marks=
            Arrays.asList(45,56,78,51);
        List<Integer> result= marks.stream()
            .filter(m -> m > 50)
            .map(m -> m+5)
            .sorted()
            .toList();
        System.out.println(result);


    }
    
}
