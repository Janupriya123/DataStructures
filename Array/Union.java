Method 1: Using HashSet // Method 1
import java.util.Scanner;
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); 
      int m=sc.nextInt();
      int a[]=new int[n]; // first array
      int b[]=new int[m]; // second array
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<m;i++)
        {
          b[i]=sc.nextInt();
        }
      HashSet<Integer>as=new HashSet<>();
        int i=0;
        while(i<a.length) // insert all elements of a into HashSet
        {
            as.add(a[i]);
            i++;
        }
        i=0;
         while(i<b.length) // insert all elements of b into HashSet
        {
            as.add(b[i]);
            i++;
        }
      i=0;
      System.out.println("Union of two arrays:");
      List<Character> list = new ArrayList<>(as); // convert HashSet int ArrayList for retrieving elements from HashSet
       while(i<list.size())
         {
           System.out.print(list.get(i));
         }
      sc.close();
    }
  }
