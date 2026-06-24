// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codechef17
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();    
        while(t-->0) 
        {
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int b3 = sc.nextInt();    
            int emptyCount = 0;
            if (b1 == 0) emptyCount++;
            if (b2 == 0) emptyCount++;
            if (b3 == 0) emptyCount++;
            if (emptyCount >= 2) 
            {
                System.out.println("Water filling time");
            }
            else 
            {
                System.out.println("Not now");
            }
        }
    }
}
