Method 1:Using Math//Method 1
import java .util.Scanner;
class A
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();//get input from user
      int ans=0;
      while(n!=0)
        {
          int l=n%10;//get last digit
          ans=ans*10+l;
          n=n/10;//remove last digit
        }
      System.out.println("Reverse of a number:"+ans);
      sc.close();
    }
  }

Method 2:Using StringBuilder
import java .util.Scanner;
class A
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String s=String.valueOf(n);//convert int to String
      StringBuilder s1=new StringBuilder(s);//convert String to StringBuilder
      String ans=s1.reverse().toString();//using reverse function reverse the value
      System.out.println("Reverse of a number:"+ans);
      sc.close();
    }
  }
  
