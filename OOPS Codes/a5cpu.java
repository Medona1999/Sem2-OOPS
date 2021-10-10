/* 5.program on inner class and static nested class*/

import java.io.*;

class a5cpu
	{
	int price=50000;

	class processor
		{
		int noofcores=2;
		String manuf="Intel";
		}
	static class RAM
		{
		String mem="2GB";
		String manuf="IBM";
		}
	
	public static void main(String []args) throws IOException
		{
		a5cpu c= new a5cpu();
		a5cpu.processor p= c.new processor();
		a5cpu.RAM r= new a5cpu.RAM();

		System.out.println("price:"+c.price);
		System.out.println("no of cores & manuf:"+p.noofcores +"  " +p.manuf);
		System.out.println("mem & manuf:"+r.mem+"  "+r.manuf);
		}
	}