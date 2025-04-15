import java.util.Scanner;
class main
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int k=sc.nextInt();
      int n=sc.nextInt();
      ArrayList<Long>arr=new ArrayList<>();
      for(int i=0;i<n;i++)
        {
          arr.add(sc.nextLong());
        }
        int l=0;
        int r=0;
        for(int i=0;i<arr.size();i=k+i)
        {
            l=i;
            r=Math.min(i+k-1,n-1);
            while(l<r)
            {
                long temp=arr.get(l);
                arr.set(l,arr.get(r));
                arr. set(r,temp);
                l++;
                r--;
            }
          for(int i=0;i<n;i++)
            {
              System.out.print(arr.get(i)+" ");
            }
          sc.close();
    }
  }
