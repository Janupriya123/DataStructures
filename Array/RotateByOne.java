
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
    int temp=arr[arr.length-1]; // Store last element
        for(int i=arr.length-2;i>=0;i--) // loop from n-2
        {
            arr[i+1]=arr[i]; // move all elements by one index rightwards
        }
        arr[0]=temp; // store the last element in index 0
    System.out.println("Rotate Array By One:");
    for(int num:arr)
    {
       System.out.print(num);
    }
    sc.close();
  }
 }
