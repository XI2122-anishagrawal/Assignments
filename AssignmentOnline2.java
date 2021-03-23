import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println(strings.parallelStream().filter(string->string.equals("")).count());
    }
}