import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list=new LinkedList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        list.add(sc.nextInt());
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            sc.nextLine();
            String a=sc.next();
            if(a.equals("Insert"))
                list.add(sc.nextInt(),sc.nextInt());
            else
                list.remove(sc.nextInt());
        }
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }
}