// Once I am done  , I will  be  gone , You won't see me for a while.

import java.util.*;
public class codechef18
{
    public static void main(String args[])                                   // Problem - Elections in Chefland
    { 
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int Xa=sc.nextInt();
            int Xb=sc.nextInt();
            int Xc=sc.nextInt();
            if(Xa>50)
            {
                System.out.println("A");
            }
            else if(Xb>50)
            {
                System.out.println("B");
            }
            else if(Xc>50)
            {
                System.out.println("C");
            }
            else
            {
                System.out.println("NOTA");
            }
        }
    }
}
