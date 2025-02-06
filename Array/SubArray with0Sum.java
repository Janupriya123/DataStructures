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
    int sum=0;
    for(int i=0;i<n;i++)
      {
        sum=0;
        for(int j=i;j<n;j++)
          {
            sum+=arr[j]; // add the elements
            if(sum==0) // if sum==0,print True
            {
              System.out.println("SubArray with 0 sum is there in the array");
              return;
            }
          }
      }
      System.out.println("SubArray with 0 sum is not there in the array");
      return;
    sc.close();
  }
 }

Method 2 : Using HashSet // Method 2

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
     HashSet<Integer>s=new HashSet<>(); // HashSet for storing sum value
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i]; // add the elements
            if(arr[i]==0 || sum==0 || s.contains(sum)) // if current==0,sum==0,sum contains in HashSet then print True
            {
              System.out.println("SubArray with 0 sum is there in the array");
              return;
            }
            s.add(sum); // add sum into Hashset
        }
     System.out.println("SubArray with 0 sum is  not there in the array");
     return;
    sc.close();
  }
 }
