import java.util.Scanner;
class A
  { 
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String S=sc.nextLine();
      String[] key={
            "2","22","222",
            "3","33","333",
            "4","44","444",
            "5","55","555",
            "6","66","666",
            "7","77","777","7777",
            "8","88","888",
            "9","99","999","9999"
        };
        int n=S.length();
        StringBuilder a=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(S.charAt(i)==' ')
            {
                a.append(0);
            }
            else
            {
                a.append(key[S.charAt(i)-'A']);
            }
        }
      System.out.println(a.toString());
      sc.close();    
    }
  }
