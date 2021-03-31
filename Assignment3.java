import java.util.*;

public class Main {
    public static void main(String args[]) {
        Map <Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Anish");
        map.put(2,"Ram");
        map.put(3,"Shyam");
        map.put(4,"Saurav");
        map.put(5,"Gaurav");

        for(Map.Entry<Integer,String> hm : map.entrySet()){
            System.out.println(hm.getKey()+":"+hm.getValue());
        }
    }
}