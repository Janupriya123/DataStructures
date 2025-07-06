1.Method 1:Using Loops
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
          a[i]=sc.nextInt(); 
        }
      int min=Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
  }

2.Method 2:Using Binary Search
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
          a[i]=sc.nextInt(); 
        }
      int low=0;
      int high=n-1;
       int ans=Integer.MAX_VALUE;
       while(low<=high)
       {
           int mid=low+(high-low)/2;
           if(arr[low]<=arr[mid])
           {
               ans=Math.min(ans,arr[low]);
               low=mid+1;
           }
           else if(arr[mid]<=arr[high])
           {
               ans=Math.min(ans,arr[mid]); 
               high=mid-1;
           }
           
        System.out.println(min);
        sc.close();
    }
  }
