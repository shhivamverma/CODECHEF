// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.util.*;
public class codechef49
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);    
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            long a[]=new long[n];    
            long sum=0;
            long minpos=Long.MAX_VALUE;
            long maxneg=Long.MIN_VALUE;
            for(int i=0;i<n;i++) 
            {
                a[i]=Math.abs(sc.nextLong());    
                if(i%2==0) 
                {
                    sum=sum+a[i];
                    minpos=Math.min(minpos,a[i]);
                } 
                else 
                {
                    sum=sum-a[i];
                    maxneg=Math.max(maxneg,a[i]);
                }
            }
            if(maxneg>minpos) 
            {
                long summ=sum+2*(maxneg-minpos);
                System.out.println(summ);
            } 
            else 
            {
                System.out.println(sum);
            }
        }
    }
}
