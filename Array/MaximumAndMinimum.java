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
            arr[i]=sc.nextInt(); // Get array Elements from 
          }
        Arrays.sort(arr);
        System.out.println("Maximum Element:"+arr[n-1]);
        System.out.println("Minimum Element:"+arr[0]);
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
      int min=Integer.MAX_VALUE;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<n;i++)
        {
          if(arr[i]>max)
          {
            max=arr[i];
          }
          else if(arr[i]>min)
          {
            min=arr[i];
          }
        }
       System.out.println("Maximum Element:"+max]);
        System.out.println("Minimum Element:"+min);
      sc.clsoe();
    }
  }
