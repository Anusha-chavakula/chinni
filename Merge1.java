import java.io.*;
public class Merge1
{
public static void main(String args[]) throws Exception
{
PrintWriter pw=new PrintWriter("Output1.txt");
BufferedReader br1=new BufferedReader(new FileReader("abc.txt"));
String l=br1.readLine();
while(l!=null)
{
pw.println(l);
l=br1.readLine();
}
BufferedReader br2=new BufferedReader(new FileReader("def.txt"));
l=br2.readLine();
while(l!=null)
{
pw.println(l);
l=br2.readLine();
}
pw.flush();
br1.close();
br2.close();
pw.close();
System.out.println("Two files merged successfully");
}
}
