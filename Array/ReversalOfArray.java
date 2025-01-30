Method 1 : Using Temporary Array // Method 1

import java.util.Scanner;
class A
  {
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n]; // original array
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      int ans[]=new int[n]; // create temporary Array
      for(int i=0;i<n;i++)
        {
          ans[n-i-1]=arr[i]; // store from first element to last element of original array   
        }
      System.out.println("Array Reverse:");
      for(int num:ans)
        {
          System.out.print(num+" ");
        }
      sc.close();
      
    }
  }

Method 2 : Using Two Pointers // Method 2
  
import java.util.Scanner;
class A
{
   public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();

      }
      int l=0; // Traverse from 0
      int r=n-1; // Traverse from n-1
      while(l<r)
      {
         int temp=arr[r]; // Swap arr[l] and arr[r]
         arr[r]=arr[l];
         arr[l]=temp;
         l++;
         r--;
      }
      System.out.println("Array Reversal");
      for(int num:arr)
      {
         System.out.print(num+" ");
      }
      sc.close();
   }

}
