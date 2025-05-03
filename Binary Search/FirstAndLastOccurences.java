Method 1 : Using counting // Method 1
   
import java.util.Scanner;            
import java.util.ArrayList;  
class A  
  {  
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); 
      int x=sc.nextInt();
      int arr[]=new int[n]; // first array
       
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      int f=-1; // variable for first occurence
      int l=-1; // variable for last occurence
      int count=0; // variable for counting if arr[i]==x
      for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x) // if arr[i]==x
            {
                count++; // count
                if(count==1) // if count==1,it is the first occurence
                {
                    f=i;
                    l=i;
                }
                else
                {
                    l=i;
                }
            }
          }
      System.out.print("First Occurence:"+f+"Last Occurence:"+l);
       sc.close(); 
    }
  }

Method 2 : Using Binary Search // Method 2

import java.util.Scanner;
import java.util.ArrayList;
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); 
      int x=sc.nextInt();
      int arr[]=new int[n]; // first array
       
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
       int l=0; // low at index 0
       int h=arr.length-1; // high at arr.length-1
       int mid=0;
       int f=-1;
        while(l<=h) // loop till l<=h
         {
             mid=(l+h)/2;
             if(arr[mid]==x) // if arr[mid]==x
             {
                 f=mid; 
                 h=mid-1; // move h to mid-1 to find first occurence
             }
             else if(arr[mid]<x) 
             {
                 l=mid+1; // move l to mid+1
             }
             else // if arr[mid]>x
             {
                 h=mid-1; // move h to mid-1
             }
         }
         l=0;
         h=arr.length-1;
         mid=0;
         int last=-1;
          while(l<=h) // loop till l<=h
         {
             mid=(l+h)/2;
             if(arr[mid]==x) // if arr[mid]==x
             {
                 last=mid;
                 l=mid+1; // move l to mid+1 to find last occurence
             }
             else if(arr[mid]<x)
             {
                 l=mid+1; // move l to mid+1
             }
             else // if arr[mid]>x
             {
                 h=mid-1; // move h to mid-1
             }
         }
       System.out.print("First Occurence:"+f+"Last Occurence:"+l);
       sc.close(); 
    }
  }
  
