import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
class A
  {
public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
          {
            a[i]=sc.nextInt();
          }
        Map<Integer, Integer> ans = new HashMap<>();
        int sum = 0;
        int max= 0;
        for (int i = 0; i < n; i++) {
              sum += a[i];
             if (sum == k) 
             {
                maxLen = Math.max(max,i + 1);
            }
            int rem = sum - k;
            if ( ans.containsKey(rem)) 
            {
                int len = i-ans.get(rem);
                max= Math.max(max, len);
            }
             if (! ans.containsKey(sum)) 
             {
                 ans.put(sum, i);
            }
        }
         System.out.println("Longest SubarryaSum:"+max);
         sc.close();
    }
}
