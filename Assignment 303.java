import java.util.*;

public class Main {
    public static void main(String args[]) {
       List <String> arr = new ArrayList<>();

       arr.add("Anish");
       arr.add("Mikhael");
       arr.add("Atul");
       arr.add("Naman");
       System.out.println(arr);

       Iterator itr = arr.iterator();

       while(itr.hasNext()){
           System.out.print(itr.next()+" ");
       }
    }
}