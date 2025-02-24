import java.util.Scanner;
class A
  { 
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int temp=0;
      while(b!=0)
        {
          temp=b; // store value of b in temp
          b=a%b; // div a by b
          a=temp; // store temp in a
        }
      System.out.println("Gcd is:"+a);
      sc.close();
    }
  }
          
