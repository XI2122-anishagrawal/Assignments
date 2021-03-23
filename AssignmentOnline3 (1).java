import java.util.*;
import java.util.stream.*;
 
public class Main {
    public static void main(String args[]) {
        List <String> arr = Arrays.asList("Mango", "Cat", "Cup", "Dog", "Rat", "Couple", "Friend");
        List <String> result = arr.stream().filter(c->c.startsWith("C")).collect(Collectors.toList());
        System.out.print(result);
    }
}