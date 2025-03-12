import java.util.Scanner; 
class A   
  { 
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
       
       for(int i=1;i*i<=a;i++)// iterate till i*i<=a
       {
        if(a%i==0)//one divisor of the number
        {
          System.out.println(i);
          if(a/i!=i)
          {
              System.out.println(a/i);//another divisor of the number
          }
        }
       }
      sc.close();
    }
  }
