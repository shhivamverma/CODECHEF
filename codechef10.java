// Once I am done , I will be gone , You won't see me for a while

import java.util.*;
public class codechef10
{
    public static void main(String args[])                          // Problem - Greater Average
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            double A=sc.nextDouble();
            double B=sc.nextDouble();
            double C=sc.nextDouble();
            if(((A+B)/2) > C)
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
