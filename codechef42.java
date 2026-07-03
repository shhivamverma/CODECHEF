// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.util.*;
public class codechef42
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> tomu=new ArrayList<>();
            ArrayList<Integer> motu=new ArrayList<>();
            for(int i=0;i<n;i++) 
            {
                int x=sc.nextInt();
                if(i%2==0)
                {
                    motu.add(x);
                }
                else
                {
                    tomu.add(x);
                }
            }
            motu.sort(Collections.reverseOrder());
            Collections.sort(tomu);
            int l=Math.min(tomu.size(),k);
            for(int i=0;i<l;i++) 
            {
                if(motu.get(i)>tomu.get(i)) 
                {
                    int temp=motu.get(i);
                    motu.set(i,tomu.get(i));
                    tomu.set(i,temp);
                } 
                else 
                {
                    break;
                }
            }
            long summ=0;
            long sumt=0;
            for(int i=0;i<motu.size();i++) 
            {
                summ=summ+motu.get(i);
            }
            for(int i=0;i<tomu.size();i++) 
            {
                sumt=sumt+tomu.get(i);
            }
            if(summ<sumt)
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
