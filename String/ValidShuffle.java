import java.util.Scanner;
class A
  { 
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      String res=sc.nextLine();
      if((s1.length()+s2.length())!=res.length()) // if s1 +s2 length is same as res length
      {
        System.out.println("Not a Valid Shuffle");
      }
      int i=0;
      int j=0;
      int k=0;
      int f=0;
      while(K<res.length()) // k <res
        {
          if(i<s1.length() && s1.charAt(i)==res.charAt(k)) //i<s1 and character at i in s1 == to character at k in res,then i++
          {
            i++;
          }
          else if(j<s2.length() && s2.charAt(j)==res.charAt(k))  //j<s2 and character at j in s2 == to character at k in res,then j++
          {
            j++;
          }
          else // if not equal initialize f=1 and break
          {
            f=1;
            break;
          }
          k++;
        }
      if(f==1) // if f==1,then not a valid shuffle
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
