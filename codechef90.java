// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

// LinkedIn - https://www.linkedin.com/in/shivamverma-dev
// GitHub - https://github.com/shhivamverma
// Portfolio - https://my-next-portfolio-hlye.vercel.app/

import java.util.*;
public class codechef90
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long arr[]=new long[n];
            long sum=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
                sum=sum+arr[i];
            }
            long min=sum;
            long pre=0;
            for(int i=0;i<n;i++)
            {
                pre=pre+arr[i];
                long suf=sum-pre;
                long curr=Math.max(suf,pre);
                min=Math.min(curr,min);
            }
            System.out.println(min);
        }
    }
}