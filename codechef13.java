// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codechef13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int Z=sc.nextInt();
            double P=(Z*100.0)/(X*Y);
            if(P>50)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}