import java.util.Scanner; 
public class Main {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int n=sc.nextInt(); 
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
        int c=0;
        int s=0;
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        while(j<arr.length)
       {
          s+=arr[j];
          c++;
         if(c==k)
      {
         max=Math.max(s,max);
        s-=arr[i];
        i++;
        c--;
    }
        j++;
    }
   System.out.println(max);
   sc.close();
}
}
