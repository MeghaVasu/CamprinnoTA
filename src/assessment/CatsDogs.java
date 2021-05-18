package assessment;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


import java.util.*;
import java.lang.*;
import java.io.*;

public class CatsDogs 
{
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(
					new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() { return Integer.parseInt(next()); }

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}



	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader sc= new FastReader();
		int t=sc.nextInt();
		while(t-->0)
		{
			long c,d,l,max_l,min_l;
			c= sc.nextLong();
			d= sc.nextLong();
			l= sc.nextLong();
			max_l=(c+d)*4;
			if(c>2*d)
			{
				min_l=(c-(2*d)+d)*4;
			}
			else
			{
				min_l=d*4;
			}



			if(l%4==0 && l>=min_l && l<=max_l)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}