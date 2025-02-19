import java.util.Scanner;
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      String res=sc.nextLine();
      if((s1.length()+s2.length())!=res.length())
      {
        System.out.println("Not a Valid Shuffle");
      }
      int i=0;
      int j=0;
      int k=0;
      int f=0;
      while(K<res.length())
        {
          if(i<s1.length() && s1.charAt(i)==res.charAt(k))
          {
            i++;
          }
          else if(j<s2.length() && s2.charAt(j)==res.charAt(k))
          {
            j++;
          }
          else
          {
            f=1;
            break;
          }
          k++;
        }
      if(f==1)
      {
        System.out.println("Not a Valid Shuffle");
      }
      else
      {
         System.out.println("It is a Valid Shuffle");
      }
      sc.close();
    }
  }
