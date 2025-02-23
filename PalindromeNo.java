import java.util.*;
public class PalindromeNo
{
  public static void main(String x[])
  {
    Scanner p=new Scanner(System.in);
    int no,rem,sum=0,temp;
    System.out.println("Enter Any Digit Number");
    no=p.nextInt();
    temp=no;
    while(no>0)
    {
       rem=no%10;
       no=no/10;
       sum=(sum*10)+rem;    
    }
    if(sum==temp)
    {
      System.out.println("This Number is Polindrome");
    }
    else
    {
      System.out.println("This Number is not Polindrome");
    }
  }
}
    