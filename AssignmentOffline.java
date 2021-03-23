import java.util.*;
//import java.util.stream;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]) {
        List <Integer> arr = Arrays.asList(1,2,13,4,15,6,17,8,19);
        Collections.sort(arr);
        System.out.println("Smallest Element:"+arr.get(0)); 
        System.out.println("Largest Element:"+arr.get(arr.size()-1));
        System.out.println("Sum of list:"+arr.stream().mapToInt(i->i).sum());
        System.out.println("Average of List:"+arr.stream().mapToDouble(i->i).average());
        arr.stream().distinct().forEach(n -> System.out.println((int)Math.pow(n, 2)));

    }
}