Using Loops // Using loops

  import java.util.Scanner; 
class A
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt(); // Size of the Array
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<n;i++)
        {
          if(arr[i]==i+1) // if current element == i+1
          {
            System.out.print(arr[i]);
          }
        }
       sc.close();
    }
  }

