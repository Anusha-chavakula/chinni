import java.io.*;
public class Demo
{
public static void main(String[] args)
{

    int N=5, i, j;
    for(i=N; i>=1; i--)
    {
        for(j=N; j>i; j--)
        {
           System.out.print(j);
        }
        for(j=1; j<=(i*2-1); j++)
        {
            System.out.print(i);
        }
        for(j=i+1; j<=N; j++)
        {
         System.out.print(j);
        }

        System.out.println();
    }
    for(i=1; i<N; i++)
    {
        for(j=N; j>i; j--)
        {
            System.out.print(j);
        }
        for(j=1; j<=(i*2-1); j++)
        {
            System.out.print(i+1);
        }
        for(j=i+1; j<=N; j++)
        {
            System.out.print(j);
        }

        System.out.println();
    }

   }
}
