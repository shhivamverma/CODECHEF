// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.util.*;
public class codechef30
{
    public static void main(String args[])                                       // Problem - Average Permutation
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=n/2;
            int per[]=new int[n];
            per[m]=1;
            per[m-1]=2;
            for(int i=m;i<n-1;i++)
            { 
                per[i+1]=per[i]+2;
            }
            for(int i=m-1;i>0;i--)
            { 
                per[i-1]=per[i]+2;
            }
            for(int i=0;i<n;i++)
            {
                System.out.println(per[i]);
            }
        }
    }
}
