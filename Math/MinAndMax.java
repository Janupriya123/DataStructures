import java.util.Scanner;
class Main   
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int min3=Integer.MAX_VALUE;
         while(a!=0 && b!=0 && c!=0 )
         {
            int l1=a%10;
            int l2=b%10;
            int l3=c%10;
            if(l1>max1)
            {
                max1=l1;
            }
            else if(l1<min1)
            {
                min1=l1;
            }
            if(l2>max2)
            {
                max2=l2;
            }
            else if(l2<min2)
            {
                min2=l2;
            }
            if(l3>max3)
            {
                max3=l3;
            }
            else if(l3<min3)
            {
                min3=l3;
            }
            a=a/10;
            b=b/10;
            c=c/10;
         }
         System.out.println("first number max and min:"+max1+" "+min1);
         System.out.println("second number max and min:"+max2+" "+min2);
         System.out.println("third number max and min:"+max3+" "+min3);
         sc.close();
    }
}
