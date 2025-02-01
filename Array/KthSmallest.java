 Method 1 : Using Priority Queue Or Min Heap // Method 1

import java.util.Scanner; 
import java.util.Queue;
import java.util.PriorityQueue;
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); // Size of the Array
      int arr[]=new int[n];
      int k=sc.nextInt(); // Kth element 
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      Queue<Integer>p=new PriorityQueue<>(); // PriorityQueue to find Kth Smallest
      int i=0;
      while(i<n)
        {
          p.offer(arr[i]); // add array elements to min heap
          i++;
        }
      int ans=0;
      while(!p.isEmpty() && k!=0) // loop until p is not empty and k is not equals to 0
        {
          ans=p.poll(); 
          k--;
        }
      System.out.println("Kth Smallest:"+ans);
      sc.close();
    }
  }

