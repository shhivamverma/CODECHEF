import java.util.*;
import java.lang.*;
import java.io.*;

public class codechef1                                                                        // Problem ATM Machine
{
	public static void main (String args[]) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    int n=sc.nextInt();
		    long K=sc.nextLong();
		    long a[]=new long[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextLong();
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]<=K)
		        {
		            System.out.print(1);
		            K=K-a[i];
		        }
                else
                {
                    System.out.print(0);
                }
		    }
            System.out.println();
        }
	}
}
