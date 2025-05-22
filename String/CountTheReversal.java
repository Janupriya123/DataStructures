import java.util.Scanner;
class A 
  {  
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      if(s.length()%2!=0) // is string is odd length
        {
            System.out.println("-1");
             return;
        }
        int size=0;
        int open=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='{') // if current character is open bracket,increment size
            {
                size++;
            }
            else if(size>0) //  if current character is closed bracket and size is > than 0,decrement size
            {
                size--;
            }
            else
            {
                open++; 
            }
            
        }
      System.out.println((int)(Math.ceil(size/2.0)+Math.ceil(open/2.0)));
     sc.close();
    }
  }
     
