import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regx
{
public static void main(String args[])
{
Pattern compile=Pattern.compile("[a-zA-Z]*[^a-zA-Z0-9][a-zA-Z]*[@][a-z]*[.][a-z]{3}");
Matcher matcher=compile.matcher("anusha_ch@gmail.com");
while(matcher.find())
{
System.out.println(matcher.group());
}
}
}

