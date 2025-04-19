import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
     int s=0;
     int f=0;
     do
     {
        s=nums[s];
        f=nums[nums[f]];

     }
     while(s!=f);
     s=0;
     while(s!=f)
     {
        s=nums[s];
        f=nums[f];
     }
    System.out.println(s);
    sc.close();

    }
}
