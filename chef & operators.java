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
	    int l=sc.nextInt();
	    for (int i=0;i<l;i++){
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        if(n1>n2){
	            System.out.println(">");
	        }
	        else if(n2>n1){
	            System.out.println("<");
	        }
	        else{
	            System.out.println("=");
	        }
	    }
	}
}
