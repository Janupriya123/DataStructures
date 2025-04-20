import java.util.Scanner; 
import java.util.HashMap;
import java.util.ArrayList;
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
        HashMap<Integer,Integer>ans=new HashMap<>();
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
        }
        for(int i=1;i<=arr.length;i++)
        {
             if(ans.containsKey(i))
             {
                 a.add(ans.get(i));
             }
             else
             {
                 a.add(0);
             }
        }
     for(int i=0;i<a.size();i++)
      {
       System.out.print(a.get(i)+" ");
      }
      sc.close();
    }
  }
