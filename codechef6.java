// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codechef6
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) 
            {
                arr[i]=sc.nextInt();
            }
            int s=0;
            boolean ok=true;
            int f=0;
            for(int i=0;i<n;i++) 
            {
                int total=s+arr[i];    
                if(total>=k) 
                {
                    s=total-k;
                } 
                else 
                {
                    ok=false;
                    f=i+1;
                    break;
                }
            }
            if(ok) 
            {
                System.out.println("YES");
            } 
            else 
            {
                System.out.println("NO "+f);
            }
        }
    }
}
