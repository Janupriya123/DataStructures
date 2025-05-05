Method 1 : Using HashMap // Method 1

import java.util.Scanner;
import java.util.Arrays;  
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); 
      int m=sc.nextInt();
      int a[]=new int[n]; // first array
      int b[]=new int[m]; // second array
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt(); // array 1
        }
      for(int i=0;i<m;i++)
        {
          b[i]=sc.nextInt(); // array 2
        } 
     HashMap<Integer,Integer>s=new HashMap<>(); // hashmap for storing count of elemnts of the first array
        for(int num:a)
        {
             s.put(num,s.getOrDefault(num,0)+1);
        }
        for(int num:b)
        {
            if(s.containsKey(num) && s.get(num)>0) // check if hashmap contains current element and its value is > 0
            {
                 s.put(num,s.get(num)-1); // decrement count
            }
            else
            {
                 System.out.println("False");
                 return;
            }
        }
          System.out.println("True");
          return;
     sc.close();
    }
  }
