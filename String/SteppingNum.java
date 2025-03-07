import java.util.Scanner;
class Main   
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String s = n + " ";  

        for (int i = 0; i < s.length() - 1; i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + 1);

            if (Math.abs(ch1 - ch2) == 1)  
            {
                System.out.println("not");
                return;  
            }
        }
            System.out.println("yes");
            sc.close();
    }
}
