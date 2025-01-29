Method 1:by counting //Method one
  import java.util.Scanner;
class A
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0; // variable for counting
       
       for(int i=2;i*i<=n;i++)
       {
        if(n%i==0) // if n divides by i 
        {
           count++; // count
        }
       }
       if(count>1) //if count>1 ,not a prime
       {
         System.out.println(n+" "+"is not a prime");
       }
       else{
             System.out.println(n+" "+"is a prime");
       }
      sc.close();
    }
  }
***********************************************************************************************************************************************************************************            
Method 2:Using Math //Method Two
import java.util.Scanner;
class A
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=2;i*i<=n;i++)
       {
       if(n%i==0)//if n divides by i then n is not a prime
        {
          System.out.println(n+" "+"is not a prime");
          sc.close();
          return;
        }
       }
        
        System.out.println(n+" "+"is a prime");
        sc.close();
       }
      
    }
