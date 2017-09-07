import java.io.*;
import java.util.*;
class arr
{
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter n");
	int n=s.nextInt();
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		int n1=s.nextInt();
		a[i]=n1;
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
	
}}