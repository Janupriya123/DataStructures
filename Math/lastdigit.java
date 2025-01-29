import java.util.Scanner;
class A
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); // get input from user
      System.out.println("Last Digit:"+n%10); // %10 will give last digit of a number
      sc.close();
    }
  }
