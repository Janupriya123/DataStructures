Method 1 : Using loop // Method 1 
import java.util.Scanner;   
class A   
  { 
    public static void main(String[] args)
    { 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); // Size of the Array
      int nums[]=new int[n]; 
      int target=sc.nextInt(); // get target element
      for(int i=0;i<n;i++)
        {
          nums[i]=sc.nextInt();
        }
      for(int i=0;i<n;i++)
        {
            if(nums[i]==target) // if current element == to target,return the index 
            {
               System.out.print("Target Element At:"+i);
               return;
            }
        }
        System.out.print("Target Element did not present in the array");
        sc.close();
    }
  }

Method 2 : Using Binary Search 

import java.util.Scanner; 
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); // Size of the Array
      int nums[]=new int[n];
      int target=sc.nextInt(); // get target element
      for(int i=0;i<n;i++)
        {
          nums[i]=sc.nextInt();
        }
       int l=0; // points at index 0
        int h=nums.length-1; // points at index n-1
        int mid=0;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(nums[mid]==target) // if current element == target,return mid
            {
               System.out.print("Target Element At:"+mid);
               return;
            }
             if(nums[l]<=nums[mid]) // if element at l <= element at mid ,then it is the sorted part
            {
                if(nums[l]<=target && target<nums[mid]) // checks if target is present in sorted part
                {
                      h=mid-1; // move h to mid-1
                }
                else // if target is not present in sorted part,move to unsorted part
                {
                    l=mid+1; // move l to mid+1
                }
            }
            else // if mid to h is sorted part
            {
                if(nums[mid]<target && target<=nums[h]) // checks if target is present in sorted part
                {
                    l=mid+1; // move l to mid+1
                }
                else // if target is not present in sorted part,move to unsorted part
                {
                    h=mid-1; // move h to mid-1
                }
            }
        }
        System.out.print("Target Element did not present in the array");
        sc.close();   
    }
  }
  
