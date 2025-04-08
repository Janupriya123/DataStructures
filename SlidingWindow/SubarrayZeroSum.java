import java.util.Scanner;
import java.util.HashMap;
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
        HashSet<Integer>s=new HashSet<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(arr[i]==0 || sum==0 || s.contains(sum))
            {
                 System.out.println("Subarry with 0 Sum is exist");
                 return;
            }
            s.add(sum);
        }
        System.out.println("Subarry with 0 Sum is not exist");
        sc.close();
  }
  }
        
    }
}
