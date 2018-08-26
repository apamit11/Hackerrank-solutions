import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length())
            return false;
        else{
        char a1[]=a.toCharArray();
        char b1[]=b.toCharArray();
        char t;
        for(int i=0;i<a1.length-1;i++)
            for(int j=i+1;j<a1.length;j++)
                if(a1[i]>a1[j])
                {
                    t=a1[i];
                    a1[i]=a1[j];
                    a1[j]=t;
                }
        for(int i=0;i<b1.length-1;i++)
            for(int j=i+1;j<b1.length;j++)
                if(b1[i]>b1[j])
                {
                    t=b1[i];
                    b1[i]=b1[j];
                    b1[j]=t;
                }
        boolean f=true;
        for(int i=0;i<a1.length;i++)
            if(a1[i]!=b1[i])
                f=false;
        return f;
        }
    }
public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
