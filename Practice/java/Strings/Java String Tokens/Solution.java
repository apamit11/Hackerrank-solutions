import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if(s.equals(""))
            System.out.println("0");
        else if(s.length()>=400000);
        else {
            
        String str[]=s.split("[   !,?._\'@]+");
        System.out.println(str.length);
        for(String x:str)
            System.out.println(x);
        }
        // Pattern pattern = Pattern.compile("[ !,?._\'@]+");
        // Matcher matcher = pattern.matcher(str);
        scan.close();
    }
}

