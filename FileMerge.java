package info.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerge {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("Output2.txt");
		File f=new File("/home/student/task");
		String[] s=f.list();
		for (String s1 : s) {
			File f1=new File(f,s1);
			 BufferedReader br = new BufferedReader(new FileReader(f1));
			String line= br.readLine();
			while(line!=null)
			{
				pw.println(line);
				line= br.readLine();
				
			}
			
			
		}
		
		System.out.println("Success");
		
		
		pw.flush();
		pw.close();

	}

}
