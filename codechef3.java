import java.util.*;
public class codechef3
{
    public static void main(String args[])                 // Problem TCS Examination
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) 
        {
            int dsa1=sc.nextInt();
            int toc1=sc.nextInt();
            int dm1=sc.nextInt();
            int dsa2=sc.nextInt();
            int toc2=sc.nextInt();
            int dm2=sc.nextInt();
            int total1=dsa1+toc1+dm1;
            int total2=dsa2+toc2+dm2;
            if(total1>total2) 
            {
                System.out.println("Dragon");
            } 
            else if(total2>total1) 
            {
                System.out.println("Sloth");
            } 
            else 
            {
                if(dsa1>dsa2) 
                {
                    System.out.println("Dragon");
                } 
                else if(dsa2>dsa1) 
                {
                    System.out.println("Sloth");
                } 
                else 
                {
                    if(toc1>toc2) 
                    {
                        System.out.println("Dragon");
                    } 
                    else if(toc2>toc1) 
                    {
                        System.out.println("Sloth");
                    } 
                    else 
                    {
                           
                        System.out.println("Tie");
                    }
                    
                }
            }
        }
    }
}
