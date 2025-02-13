import java.util.Scanner;
 
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); 
      int m=sc.nextInt();
      int arr1[]=new int[n]; // first array size
      int arr2[]=new int[m]; // second array size
       int res[]=new int[n+m]; // result array for storing merged elemnts
      for(int i=0;i<n;i++)
        {
          arr1[i]=sc.nextInt(); // get input from user for arr1
        }
        for(int i=0;i<m;i++)
        {
          arr2[i]=sc.nextInt(); // get input from user for arr2 
        }
        int i=0;
        for(i=0;i<n;i++)
        {
             res[i]=arr1[i]; // store arr1 elements in result array
        }
        for(int j=0;j<m;j++)
        {
          res[j+i]=arr2[j]; // store arr2 elements in result array
        }
        for(int k=0;k<res.length;k++)
        {
            System.out.print(res[k]+" "); // Display result array
        }
        
       sc.close();
 
    }
}
