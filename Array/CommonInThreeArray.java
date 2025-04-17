import java.util.Scanner; 
class  CommonInThreeArray
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); // size of array 1
      int m=sc.nextInt(); // size of array 1
      int l=sc.nextInt(); // size of array 1
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      int b[]=new int[m];
      int c[]=new int[l];
       for(int i=0;i<m;i++)
        {
          b[i]=sc.nextInt();
        }
       for(int i=0;i<l;i++)
        {
          c[i]=sc.nextInt();
        }
      
      while(i<n && j<m && k<l) // loop runs till the condition is true
        {
          if(a[i]==b[j] && b[j]==c[k]) // if all three elements  are equal,print the element
          {
            System.out.print(a[i]);
            i++;
            j++;
            k++;
              while(i<n && a[i]==a[i-1]) // skip duplicate elements
            {
              i++;
            }
              while(j<m && b[j]==b[j-1]) // skip duplicate elements
            {
              j++;
            }
              while(k<l && c[k]==c[k-1]) // skip duplicate elements
            {
               k++;
            }
          }
          else if(a[i]<b[j])  // If a[i] < b[j], move i
          {
            i++;
          }
          else if(b[j]<c[k]) // If b[j] < c[k], move j
          {
            j++;
          }
          else // If b[j] < c[k], move k
          {
            k++;
          }
         
        }
      sc.close();
    }
  }
