/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		while(i!=0){
		    int t1=sc.nextInt();
		    int t2=sc.nextInt();
		    if(t1>=t2){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    i--;
		}
	}
}
