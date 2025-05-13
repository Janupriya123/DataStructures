Method 1
import java.util.Arrays;
import java.util.Scanner;
class rough {
    public static void main(String[] args) {
         Scannner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        int count = 0;
       for(int i=0;i<n;i++)
         {
           a[i]=sc.nextInt();
         }
        int freq[] = new int[n + 1];       
        Arrays.sort(a);
        for (int i : a) {
            freq[i]++;
        }
        for (int i = 1; i <= n; i++) {
            if (freq[i] >= 2) {
                count++;
            }
            a[i - 1] = i;
        }
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println(count);
        sc.close();
    }
}

Method 2
import java.util.Arrays;
import java.util.Scanner;
class rough {
    public static void main(String[] args) {
        Scannner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        int count = 0;
       for(int i=0;i<n;i++)
         {
           a[i]=sc.nextInt();
         }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] != (i + 1) && (((i + 1) != n) && a[i + 1] == (i + 1))) {
                a[i] = a[i + 1];
            } else if (a[i] != (i + 1)) {
                a[i] = i + 1;
                count++;
            }
        }
        for (int i : a) {
            System.out.print(i);
        }
      System.out.println();
      System.out.println(count);
      sc.close();
    }
}
  
