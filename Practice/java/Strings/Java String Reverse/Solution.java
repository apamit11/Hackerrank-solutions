import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder A1 = new StringBuilder();
       // StringBuilder A2 = new StringBuilder();
        A1.append(A);
 
        
        A1 = A1.reverse();
 
        String a2=A1.toString();
        if(a2.equals(A))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}



