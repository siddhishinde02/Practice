import java.util.*;
public class ReverseNoArray
{
  public static void main(String x[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter five values in Array:");
    int a[]=new int[5];
    for(int i=0;i<a.length;i++)
    {
      a[i]=s.nextInt();
    }
    int rev[]=new int[5];
    for(int i=0;i<5;i++)
    {
        rev[i]=a[5-i-1];
        System.out.printf("%d\t",rev[i]);
    }
  }
}