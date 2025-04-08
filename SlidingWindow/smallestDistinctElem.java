import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
class A
  {
public static void main(String[] args)
  {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       HashSet<Character>t=new HashSet<>();
       HashMap< Character,Integer>ans=new HashMap<>();
       for(char c:s.toCharArray())
       t.add(c);
       int rem=t.size();
       int r=0,l=0;
       int form=0;
       int min=Integer.MAX_VALUE;
       while(r<s.length())
       {
           char ch=s.charAt(r);
           ans.put(ch,ans.getOrDefault(ch,0)+1);
           if(ans.get(ch)==1)
           {
               form++;
           }
           while(form==rem)
           {
               min=Math.min(min,r-l+1);
               char cm=s.charAt(l);
               ans.put(cm,ans.getOrDefault(cm,0)-1);
               if(ans.get(cm)==0)
               {
                   form--;
               }
               l++;
           }
           r++;
       }
       System.out.println("Smallest Distinct Elements"+min);
       sc.close();
  }
  }
