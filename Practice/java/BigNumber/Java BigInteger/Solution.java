import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String y=sc.nextLine();
        BigInteger b1=new BigInteger(x);
        BigInteger b2=new BigInteger(y);
        BigInteger b3=b1.add(b2);
        BigInteger b4=b1.multiply(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}