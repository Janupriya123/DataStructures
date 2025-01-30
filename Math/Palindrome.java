import java.util.Scanner;
class A
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); // get input from user
      int a=n; //Store the copy of the number
      int ans=0;
      while(n!=0) //loop till n!=0
        {
           ans=ans*10+n%10; // multiply ans with 10 and add with last digit of the number
           n=n/10; // remove last digit
        }
       if(a==ans) //check if original number is equal to reversed number
       {
         System.out.println("It is a Palindrome");
       }
        else
       {
         System.out.println("It is not a Palindrome");
       }
        sc.close();

      }
  }
