import java.util.Scanner;
class  A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=sc.nextInt();
        int  a[] = new int[n];
        int b[]=new int[t];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         for (int i = 0; i < t; i++) {
             b[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        int arr[]=new int[a.length+b.length];
        int m=0;
        int i=0;
        int j=0;
        if(k<=0 || k>a.length+b.length)
        {
             System.out.print("-1");
             return;
        }
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                arr[m++]=a[i];
                i++;
            }
            else if(a[i]>b[j])
            {
                arr[m++]=b[j];
                j++;
            }
        }
        while(i<a.length)
        {
            arr[m++]=a[i++];
        }
         while(j<b.length)
        {
            arr[m++]=b[j++];
        }
        System.out.print(arr[k-1]);
        return; 
        sc.close();   
    }
}
