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

Method 2: Using Two Pointers // Method 2

import java.util.Scanner;
import java.util.ArrayList;
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
        }ArrayList<Integer> ans=new ArrayList<>();
int i=0;
int j=0;
while(i<a.length && j<b.length)
{
    if(a[i]<=b[j]) // if a[i]<=b[j]
    {
        if(ans.size()==0 || ans.get(ans.size()-1)!=a[i]) 
        ans.add(a[i]);
        i++;
         
    }
    else if(a[i]>b[j])
    {
        if(ans.size()==0 || ans.get(ans.size()-1)!=b[j])
        ans.add(b[j]);
        
        j++;
         
    }
   
}
while(i<a.length)
{
  if(ans.size()==0 || ans.get(ans.size()-1)!=a[i])
  {
    ans.add(a[i]);
    i++;
  }
     
}
while(j<b.length)
{
  if(ans.size()==0 || ans.get(ans.size()-1)!=b[j])
  {
    ans.add(b[j]);
    j++;
  }
     
}
int k=0;
while(k<ans.size())
{
  System.out.print(ans.get(k)+" ");
  k++;
}
sc.close();
 
    }
}

