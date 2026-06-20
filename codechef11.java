// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codechef11
{
    public static void main(String args[])                                   // Problem - Subscriptions
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int N=sc.nextInt();
            int X=sc.nextInt();
            int D=N/6;
            int R=N%6;
            int cost=0;
            if(R!=0)
            {
                cost=X*(D+1);
            }
            else
            {
                cost=D*X;
            }
            System.out.println(cost);
        }
    }
}
