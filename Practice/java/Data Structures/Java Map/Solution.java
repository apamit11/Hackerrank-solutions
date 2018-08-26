//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String, Integer> x = new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            x.put(name, phone); 
			in.nextLine();
		}
		while(in.hasNext())
		{
            String s = in.nextLine();
         if(x.containsKey(s)) //if exists
             System.out.println(s + "=" + x.get(s));
          else
              System.out.println("Not found");

  
		}
	}
}



