//writing and reading a file
import java.io.*;
class f2rwfile
{
public static void main(String []a)
{
byte f2city[]={'D','E','L','H','I','\n','M','U','M','B','A','I','\n'};
FileOutputStream outfile=null;   //writing to file
try
{
outfile= new FileOutputStream("f2city.txt");
outfile.write(f2city);
outfile.close();	
}
catch(IOException e)
{
System.out.println(e);
}
FileInputStream infile=null;   //reading from file
int b;
try
{
infile= new FileInputStream("f2city.txt");
while((b=infile.read())!= -1)
{
System.out.println((char)b);
}
infile.close();
}
catch(IOException e1)
{
System.out.println(e1);
}
}
}
