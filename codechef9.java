// Once I am done , I will be gone , You won't see me for a while.
import java.util.*;
public class codechef9
{
    public static void main(String args[])                       // Problem - Bear and Candies 123
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0)
        {
            int A=sc.nextInt();
            int B=sc.nextInt();
            int l=0;
            int b=0;
            int i=1;
            while(true)
            {
                if(i%2 != 0)
                {
                    l=l+i;
                }
                else
                {
                    b=b+i;
                }
                if(l>A) 
                {
                    System.out.println("Bob");
                    break;
                } 
                else if(b>B) 
                {
                    System.out.println("Limak");
                    break;
                }
            }
        }
    }
}
