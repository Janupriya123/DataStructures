import java.util.Scanner;            
class A   
  {  
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        long l=0;
        long r= Long.MAX_VALUE;
        long mid=0;
        long ans=0;
        while(l<=r)
        {
              mid=l+(r-l)/2;
              if(Runner.get(mid)==1)
              {
                  ans=mid;
                  r=mid-1;
              }
              else
              {
                  l=mid+1;
              }
        }
        System.out.println(ans);
        sc.close();
    }
  }
            
