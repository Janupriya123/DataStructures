 import java.util.Scanner;
 
class A 
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine(); // get input from user
      StringBuilder s1=new StringBuilder();
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
         int a=ch;
         if((a>='A'&& a<='Z')) // the character is UpperCase
         {
          s1.append((char)(ch+32)); // convert to LowerCase by adding 32 to the character
         }
         else // the character is LowerCase
         {
          s1.append((char)(ch-32)); // convert to UpperCase by subtracting 32 to the character
         }
      }
      String a=s1.toString(); 
      System.out.println(a);
       sc.close();
 
    }
}
