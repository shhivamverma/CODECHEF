import java.util.*;
public class codechef7
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();    
        while(t-->0) 
        {
            int n=sc.nextInt(); 
            int x=sc.nextInt(); 
            if(n%2==0) 
            {
                System.out.println("YES");
            } 
            else if(x%2==0) 
            {
                System.out.println("NO");
            } 
            else 
            {
                System.out.println("YES");
            }
        }
   }
}
