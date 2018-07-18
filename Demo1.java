import java.io.*;
public class Demo1
{
public static void main(String args[]) throws IOException
{
BufferedWriter bw=new BufferedWriter(new FileWriter("def.txt"));
bw.write("dddd");
bw.newLine();
bw.append("eeee");
bw.newLine();
bw.append("ffff");
bw.newLine();
bw.flush();
bw.close();
System.out.println("Success");
}
}

