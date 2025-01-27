import java.util.Scanner;
class A
  {
   public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();//get input from user
      int count=0;//variable for counting digits
      while(n!=0)
        {
          count++;//count the digits
          n=n/10;//remove last digit after counting
        }
      System.out.println("Digits count:"+count);//display the results
      sc.close();
    }
  }
          
