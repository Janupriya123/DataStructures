import java.util.Scanner;
import java.util.Arrays;
class Main {
         public static void main(String[] args) 
        {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int j=0;
        int k=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            if(i!=0 && arr[i]==arr[i-1])
            continue;
            j=i+1;
            k=arr.length-1;
            while(j<k)
            {
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==target)
                 {
                      System.out.print("true");
                      return;
                 }
                 else if(sum>target)
                 {
                     k--;
                 }
                 else
                 {
                     j++;
                 }
            }
        }  
           System.out.print("true");
           return;
         sc.close();
    }
}
