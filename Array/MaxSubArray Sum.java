Method 1 : Using Nested Loops // Method 1
import java.util.Scanner;
 class Main
 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int sum=0; // variable for adding 
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
      {
        sum=0;
    for(int j=i;j<n;j++)
      {
        sum+=arr[j]; // add current element
        max=Math.max(max,sum);
      }
      }
    System.out.println("Maximum Subarray Sum"+max);
    sc.close();
  }
 }

Method 2 : Using Kadane Algorithm // Method 2
  import java.util.Scanner;
 class Main
 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
     int sum = 0;
     int max=Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) 
      {
              sum+=arr[i]; // add current element
              if(sum>max) // if sum>max
              {
                  max=Math.max(max,sum); // replace max as sum
              }
              if(sum<0) // if sum==0
              {
                  sum=0; // reset sum=0
              }
        }
      System.out.println("Maximum Subarray Sum"+max);
    sc.close();
  }
 }
    
