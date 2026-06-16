import java.util.*;
public class codechef5
{
    public static void main(String args[])                                     // Problem Candies
    {
        Scanner sc=new Scanner(System.in);    
        int t=sc.nextInt();    
        while(t-->0) 
        {
            int n=sc.nextInt();
            int tot=2*n;
            HashMap<Integer, Integer> mp=new HashMap<>();
            boolean ok=true;
            for(int i=0;i<tot;i++) 
            {
                int p=sc.nextInt();
                mp.put(p,mp.getOrDefault(p,0)+1);
                if(mp.get(p)>2) 
                {
                    ok=false;
                }
            }
            if(ok) 
            {
                System.out.println("Yes");
            } 
            else 
            {
                System.out.println("No");
            }
        }
    }
}
