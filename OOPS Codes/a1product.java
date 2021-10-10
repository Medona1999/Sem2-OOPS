/*program to find lowest price of 3 items*/

import java.io.*;
import java.lang.*;

public class a1product
	{
	int pcode;
	String pname;
	int price;
	BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
	
	public void getdata()
		{
		try
			{
			System.out.println("enter pcode, price,pname");
			pcode=Integer.parseInt(br.readLine());
			price=Integer.parseInt(br.readLine());
			pname=br.readLine();
			}
		catch(IOException e)
			{
			System.out.println(e);
			}
		}

	public void show()
		{
		System.out.println("pcode:"+pcode);
		System.out.println("pname:"+pname);
		System.out.println("price:"+price);
		}
	static void compare(a1product p1,a1product p2,a1product p3)
		{
		System.out.println(" The product with lowest price is:");
		if(p1.price<p2.price && p1.price < p3.price)
			{
			System.out.println("pcode:"+p1.pcode);
			System.out.println("pname:"+p1.pname);
			System.out.println("price:"+p1.price);
			}
		else if(p2.price<p1.price && p2.price < p3.price)
			{
			System.out.println("pcode:"+p2.pcode);
			System.out.println("pname:"+p2.pname);
			System.out.println("price:"+p2.price);
			}
		else
			{
			System.out.println("pcode:"+p3.pcode);
			System.out.println("pname:"+p3.pname);
			System.out.println("price:"+p3.price);
			}
		
		}
	public static void main(String[] args) throws IOException
		{
		a1product p1,p2,p3;
		p1= new a1product();
		p2= new a1product();
		p3= new a1product();
		p1.getdata();
		p2.getdata();
		p3.getdata();
		p1.show();
		p2.show();
		p3.show();
		compare(p1,p2,p3);
		
		}
	}