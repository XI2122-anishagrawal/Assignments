import java.util.*;

public class Main {
    public static void main(String args[]) {
        ArrayList <Integer> arr = new ArrayList<Integer>();

    for(int i=0;i<20;i++){
        Random rand = new Random();
        arr.add(rand.nextInt(20));
    }
    for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i)+" ");
        
    }
    System.out.println();
    arr.remove(5);
    arr.remove(13);
    arr.remove(15);
   // arr.remove(17);

    for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i)+" ");
    }
}
}