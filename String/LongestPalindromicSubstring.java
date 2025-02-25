import java.util.Scanner;
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
       if(s.length()<=1) // string less than or equal to 1
         {
             System.out.println(s);
             return;
         }
         String ans = s.substring(0, 1); // store index of 0
         int l=0;
         int h=0;
         for(int i=1;i<s.length();i++) // start from index 1
         {
             l=i;
             h=i;
             while(s.charAt(l)==s.charAt(h)) // if it is true then, it is palindrome
             {
                 l--;
                 h++;
                 if(l==-1 || h==s.length()) // Terminate if we reach index -1 or index string.length()
                 {
                     break;
                 }
             }
             String palindrome=s.substring(l+1,h); // store string from l and h
             if(palindrome.length()>ans.length()) // if new substring is longer
             {
                 ans=palindrome;
          
             }
             l=i-1; // for even length palindromic substring
             h=i;
               while(s.charAt(l)==s.charAt(h))
             {
                 l--;
                 h++;
                 if(l==-1 || h==s.length())
                 {
                     break;
                 }
             }
              palindrome=s.substring(l+1,h);
             if(palindrome.length()>ans.length())
             {
                 ans=palindrome;
          
             }
         }
          System.out.println("Longest Palindromic Substring:"+ans);
          sc.close();
    }
  }
