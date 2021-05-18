package assessment;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Cookies 
{	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner cin=new Scanner(System.in);
		int t=cin.nextInt();
		while(t-->0)
		{
			int n=cin.nextInt();
			//String[] s=new String[n];
			String s="";
			int f=0,g=0;
			for(int i=0;i<n;i++)
			{

				s=cin.next();
				if(f>0)
				{
					if(!s.equals("milk"))
						g++;
					f=0;
				}
				if(s.equals("cookie"))
				{
					f++;
				}
			}
			if(s.equals("cookie"))
				System.out.println("NO");
			else{
				if(g>0)
					System.out.println("NO");
				else
					System.out.println("YES");
			}
		}
	}
}
