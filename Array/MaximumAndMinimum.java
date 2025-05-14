Method 1 :Using Sorting

import java.util.Scanner;
import java.util.Arrays;
  class A
    {
      public static void main(String[] args) 
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt(); // Get array Elements from Users
          }
        Arrays.sort(arr); // Sort the array
        System.out.println("Maximum Element:"+arr[n-1]); // Print last element which is the Maximum element
        System.out.println("Minimum Element:"+arr[0]); // Print First element which is the minimum element
        sc.close();
      }
    }

Method 2 : Using Linear Search

import java.util.Scanner;
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      int min=Integer.MAX_VALUE; // Assign Integer Maximum
      int max=Integer.MIN_VALUE; // Assign Integer Minimum
      for(int i=0;i<n;i++)
        {
          if(arr[i]>max) // if current element greater than max 
          {
            max=arr[i]; // replace max as current element
          }
          else if(arr[i]<min) // else if current element greater than min
          {
            min=arr[i]; // replace min as current element
          }
        }
       System.out.println("Maximum Element:"+max);
        System.out.println("Minimum Element:"+min);
      sc.close();
    }
  }
