// Once I am done , I will be gone , You won't see me for a while.

import java.util.*;
public class codechef8
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);    
        int t=sc.nextInt();   
        while(t-->0) 
        {
            int n=sc.nextInt();
            String s=sc.next();
            char ch[]=s.toCharArray();    
            for(int i=0;i<n-1;i+=2) 
            {
                char temp=ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;
            }
            for(int i=0;i<n;i++) 
            {
                ch[i]=(char)('z'-(ch[i]-'a'));
            }
            System.out.println(new String(ch));
        }
    }
}
