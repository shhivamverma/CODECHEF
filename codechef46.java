// Once I am done , I will be gone , You won't see me for a while.

//  ███████╗ ██╗  ██╗ ██╗ ██╗   ██╗  █████╗  ███╗   ███╗
//  ██╔════╝ ██║  ██║ ██║ ██║   ██║ ██╔══██╗ ████╗ ████║
//  ███████╗ ███████║ ██║ ██║   ██║ ███████║ ██╔████╔██║
//  ╚════██║ ██╔══██║ ██║ ╚██╗ ██╔╝ ██╔══██║ ██║╚██╔╝██║
//  ███████║ ██║  ██║ ██║  ╚████╔╝  ██║  ██║ ██║ ╚═╝ ██║
//  ╚══════╝ ╚═╝  ╚═╝ ╚═╝   ╚═══╝   ╚═╝  ╚═╝ ╚═╝     ╚═╝

import java.io.*;
import java.util.*;
class codechef46
{
    public static void main(String args[]) throws Exception                                    // Problem - Bella ciao
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(br.readLine());
        while(t-->0) 
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            long D=Long.parseLong(st.nextToken());
            long d=Long.parseLong(st.nextToken());
            long P=Long.parseLong(st.nextToken());
            long Q=Long.parseLong(st.nextToken());
            long k=D/d;
            long rem=D%d;
            long ans=d*(k*P+(k*(k-1)/2)*Q)+rem*(P+k*Q);
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}
