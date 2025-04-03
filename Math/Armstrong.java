import java.util.Scanner; 
public class Main {   
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Enter the number: ");
         int n=sc.nextInt(); 
         int a=n; // store the copy of original number
         int res=0;
         while(n!=0) 
         {
            int l=n%10; // store  the last digit of the number
            res+=Math.pow(l,3); // find the cube of the last digit and add to res variable
            n=n/10; // remove last digit

         }
         if(res==a) // if res is same as a then it  is Armstrong 
         {
            System.out.println("Armstrong");

         }
         else
         {
            System.out.println("Not a Armstrong");
         }
         sc.close();
    }
}
