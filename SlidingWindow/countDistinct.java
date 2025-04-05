import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
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
            arr[i]=sc.nextInt();
          }
        ArrayList<Integer>a=new ArrayList<>();
        HashMap<Integer,Integer>ans=new HashMap<>();
        int i=0;
        int j=0;
        int count=0;
        while(j<n)
        {
            ans.put(arr[j],ans.getOrDefault(arr[j],0)+1);
           
            if(j-i+1==k)
            {
                a.add(ans.size());
                
                int l=ans.get(arr[i]);
                ans.put(arr[i],l-1);
                if(ans.get(arr[i])==0)
                {
                    ans.remove(arr[i]);
                }
                i++;
            }
            j++;
            
        }
         System.out.println("Count of Distinct elements of size k");
         for(int i=0;i<a.size();i++)
           {
             System.out.print(a.get(i)+" ");
           }
        sc.close();    
  } 
}
