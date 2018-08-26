import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int l=s.length()+1-k;
        String a[]=new String[l];
        for(int i=0;i<l;i++)
            a[i]=s.substring(i,i+k);
        String temp;
        for(int i=0;i<l-1;i++)
            for(int j=i+1;j<l;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        smallest=a[0];
        largest=a[l-1];
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}