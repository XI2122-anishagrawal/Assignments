import java.util.*;
import java.lang.String;

public class Main {
    public static void main(String args[]) {
        String [] str = {"A","B","C","D","E"};

        String [] rev = new String[str.length];

        System.out.println(Arrays.toString(str));
        //System.out.println(rev);
        //int n = str.length-1;
       for(int i=0;i<str.length;i++){
            rev[i]=str[str.length - i - 1];
            //n--;
        }
        System.out.print(Arrays.toString(rev));
    }
}