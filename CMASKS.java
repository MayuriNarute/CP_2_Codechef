/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//import java.Scanner.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int i= sc.nextInt();
		while(i!=0){
		    int n1= sc.nextInt();
		    int n2=sc.nextInt();
		    if((n1*100 == n2*10) || (n1*100 > n2*10)){
		        System.out.println("Cloth");
		    }
		    else{
		        System.out.println("Disposable");
		    }
		    i--;
		}
		sc.close();
	}
}
