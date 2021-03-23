import java.util.*;
import java.util.stream.*;
 
public class Main {
    public static void main(String args[]) {
        List <Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr,1,4,5,8,6,2,3);
        System.out.println(arr);
 
        List <Integer> square = arr.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
 
        List <Integer> hold = square.stream().filter(x -> x>15).collect(Collectors.toList());
        System.out.println(hold);
 
        List <Integer> sort = hold.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);
 
        List <String> str = Arrays.asList("ABC","ACD","AMB","BCM","EDS","EDA");
        List <String> withA = str.stream().filter(a->a.startsWith("A")).collect(Collectors.toList());
        System.out.println(withA);
 
        arr.stream().map(x->x*x).forEach(y->System.out.print(y+" "));
 
        System.out.println();
        
        int number = arr.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        System.out.print(number);
 
    }
}