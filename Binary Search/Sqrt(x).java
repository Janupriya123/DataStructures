Method 1 : Using Built-in function // Method 1

import java.util.Scanner;
class A
  {
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt(); // get input from User
      int c=(int)Math.sqrt(x); // use Math.sqrt function 
      System.out.print("Square root of x is:"+c);
      sc.close();
    }
  }

Method 2 : Using Binary Search // Method 2

import java.util.Scanner;
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt(); // get input from User
       if(x==0||x==1) // if x is 0 or 1
          {
              System.out.print("Square root of x is:"+x);
              return;
          }
          int l=1;
          int h=x;
          int ans=0;
          while(l<=h)
          {
            int mid=l+(h-l)/2;
            if(mid<=x/mid) // ie mid*mid<=x is true,to avoid overflow using mid<=x/mid
            {
                ans=mid; // store mid
                l=mid+1; // move l to mid+1
            }
            else // if mid*mid>x
            {
                h=mid-1; // move h to mid-1
            }
          }
       System.out.print("Square root of x is:"+ans);
        sc.clsoe();
    }
  }

  
