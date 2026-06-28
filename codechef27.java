import java.util.*;
public class codechef27
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);    
        int t=sc.nextInt();
        while(t-->0) 
        {
            String s1=sc.next();
            String s2=sc.next();    
            int min=0;
            int max=0;
            for(int i=0;i<s1.length();i++) 
            {
                char ch=s1.charAt(i);
                char chh=s2.charAt(i);
                if(ch=='?' || chh=='?') 
                {
                    max++; 
                } 
                else if(ch != chh) 
                {
                    min++;
                    max++;
                }
            }
            System.out.println(min+" "+max);
        }
    }
}