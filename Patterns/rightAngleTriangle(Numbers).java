import java.util.Scanner;
class A 
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=n;j++)
            { 
              System.out.print(j);
            }
          System.out.println(); 
        } 
      sc.close();
    }
  }
