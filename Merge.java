import java.io.*;
public class Merge
{
public static void main(String args[]) throws Exception
{
PrintWriter pw=new PrintWriter("OutputFile.txt");
BufferedReader br1=new BufferedReader(new FileReader("abc.txt"));
BufferedReader br2=new BufferedReader(new FileReader("def.txt"));
String l1=br1.readLine();
String l2=br2.readLine();

while((l1!=null)||(l2!=null))
{
if(l1!=null)
{
pw.println(l1);
l1=br1.readLine();
}
if(l2!=null)
{
pw.println(l2);
l2=br2.readLine();
}
}
pw.flush();
br1.close();
br2.close();
pw.close();
System.out.println("Two files alternatively merged successfully");
}
}
