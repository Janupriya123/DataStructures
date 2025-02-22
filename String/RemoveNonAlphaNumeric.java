import java.util.Scanner;
 
class A 
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine(); // get input from user
      StringBuilder s1=new StringBuilder(); // StringBuilder for appending characters
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')) // check if the current character is UpperCase,LowerCase or Digits
        {
          s1.append(ch); 
        }
      }
      String a=s1.toString(); 
      System.out.println(a);
      sc.close();
 
    }
}
