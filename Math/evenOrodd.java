import java.util.Scanner;
class A
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt(); // get input from User
    if(n%2==0) // if Remainder is 0 then even else Odd
    {
       System.out.println("Even");
     }
     else
     { 
       System.out.println("Odd");
     }
      sc.close();
  }
}
