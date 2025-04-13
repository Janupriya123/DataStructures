import java.util.Scanner;
import java.util.HashMap;
class A  
  {
public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        HashMap< Character,Integer>ans=new HashMap<>();
        int l=0,r=0;
        int req=3;
        int form=0;
        int min=Integer.MAX_VALUE;
        while(r<S.length())
        {
            char ch=S.charAt(r);
            ans.put(ch,ans.getOrDefault(ch,0)+1);
            if(ans.get(ch)==1)
            {
                form++;
            }
            while(form==req)
            {
                min=Math.min(min,r-l+1);
                char li=S.charAt(l);
                ans.put(li,ans.get(li)-1);
                if(ans.get(li)==0)
                {
                    form--;
                }
                l++;
            }
            r++;
        }
        if(min==Integer.MAX_VALUE)
        {
             System.out.println("No  Subarray conatins 0,1,2");
        }
        else
        {
             System.out.println("Smallest Subarray contains 0,1,2"+min);
        }
        sc.close();
  }
  }
