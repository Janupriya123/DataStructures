import java.util.Scanner; 
class A
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
        int n1 = arr.length + 1;
        long total =(long)  n1* (n1 + 1) / 2;
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.print((int) (total - sum));
        sc.close();
    }
  }
