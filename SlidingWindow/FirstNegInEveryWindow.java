import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
       for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int k = sc.nextInt();
       ArrayList<Integer>  a = new ArrayList<>();
       LinkedList<Integer>  d = new LinkedList<>();
       int i = 0, j = 0;
      while (j < arr.length)
        {
           if (arr[j] < 0) 
           {
                d.add(arr[j]);
            }
           if (j - i + 1 < k) 
           {
                j++;
            } 
           else if (j - i + 1 == k) 
           {
                if (! d.isEmpty()) 
                {
                     a.add( d.peek());
                } 
                else 
                {
                     a.add(0);
                }
              if (! d.isEmpty() && arr[i] ==  d.peek()) 
              {
                     d.poll();
                }

                i++;
                j++;
            }
        }
          
        for (int num : result) {
            System.out.print(num + " ");
        }
       sc.close();
        
    }
}
