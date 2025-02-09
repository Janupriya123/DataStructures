import java.util.Scanner;
class BestTimeToBuyStocks
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); 
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        int max=0; // Initialize max profit as 0
        int min=arr[0]; // Initialize min stock price to buy as arr[0]
        for(int i=1;i<arr.length;i++)
        {
            int cur=arr[i]-min; // Subtract the current stock and minimum stock
            max=Math.max(max,cur); // find maximum profit among max and cur
            min=Math.min(min,arr[i]); // find minimum stock among min and current stock
        }
      System.out.println("Maximum Profit:"+max);
      sc.close();
    }
  }
