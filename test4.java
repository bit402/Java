//import java.util.Scanner;
//import java.util.Random;
/*class z
{
}*/
package com;
import static java.lang.System.*;
import static java.lang.Math.*;
public class practice
{
	/*public static int sum(int n)
	{
		int i=0;
		int sum=0;
		for(i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	public static int digui(int n)
	{
		int sum=0;
		if(n>0)
		{
			sum= n+digui(n-1);
			return sum;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int digui2(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n+digui2(n-1);
	}*/
	/*public static int digui(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*digui(n-1);
	}*/
	/*public static int tuzi(int n)
	{
		if(n<3)
		{
			return 2;
		}
		int a=n/3;
		int i=0;
		int sum=1;
		for(i=1;i<=a+1;i++)
		{
			sum*=2;
		}
		return sum;
	}*/
	/*public static int tuzi(int n)
	{
		if(n<3)
		{
			return 1;
		}
		return tuzi(n-1)+tuzi(n-2);
	}*/
	public static void main(String args[])
	{
		/*int n=5;
		System.out.println(sum(10));
		System.out.println(digui(10));
		System.out.println(digui2(10));*/
		//System.out.println(digui(5));
		//System.out.println(tuzi(5));
		//System.out.println("Java中的包机制。");
		out.println(1);
		out.println(2);
		System.out.println(Math.abs(-110));
		out.println(abs(-110));
	}
}

package a.b.c;
public class test
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		System.out.println("示例");
	}
}

package a.b.e;
//import a.b.c.test;
public class test2
{
	public static void main(String args[])
	{
		System.out.println("lianxi");
		/*int a=5;
		int b=6;
		int c=0;*/
		int x=5;
		int y=6;
		int z=0;
		z=a.b.c.test.add(x,y);
		 //c = test.add(a, b);
		System.out.println(z);
	}
}