import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        int count=0;
        for(String item : strings){
            if(item.isEmpty()){
                count++;
            }
        }
        System.out.print(count);
    }
}