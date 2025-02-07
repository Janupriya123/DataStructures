import java.util.Scanner;
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); // get input from User
       int count=0;
        for(int i=1;i<n;i++)
        {
            if(i*i<n) // if i*i<n is true,then count
            {
                count++;
            }
            else // else print count and return 
            {
                 System.out.print("Count of Squares less than n:"+count);
                  return;
            }
        }
        System.out.print("Count of Squares less than n:"+count);
        sc.close();
    }
  }
