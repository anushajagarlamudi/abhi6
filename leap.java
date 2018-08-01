import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int leap=sc.nextInt();
		if((leap%4==0)&&(leap%100!=0)&&(leap%400==0))
		System.out.println("leap year");
		else
		System.out.pintln("not leapyear");
	}
}
