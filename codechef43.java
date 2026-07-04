// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.util.*;
public class codechef43
{
    public static void main(String args[])                               // Problem - Array Halves
    {
        Scanner sc=new Scanner(System.in);    
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int p[]=new int[(2*n)];
            for(int i=0;i<2*n;i++) 
            {
                p[i]=sc.nextInt();
            }
            long ops=0;
            int r=n; 
            for(int l=0;l<n;l++) 
            {
                if(p[l]>n) 
                {     
                    while(r<2*n && p[r]>n) 
                    {
                        r++;
                    }
                    ops=ops+(r-l);
                    r++;
                }
            }
            System.out.println(ops);
        }
    }
}
