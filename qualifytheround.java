import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int x=S.nextInt();
		    int y=S.nextInt();
		    int z=S.nextInt();
		    int a=(y*1)+(z*2);
		    if(a>=x)
		    {
		        System.out.println("Qualify");
		    }
		    else{
		        System.out.println("NotQualify");
		    }
		}

	}
}
