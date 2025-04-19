import java.util.Scanner;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = arr[0];
        int count = 0;
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            if (a > 0) {
                if (ans.containsKey(arr[i]) && ans.get(arr[i]) > 0) {
                    s = ans.get(arr[i]);
                    break;
                } else {
                    ans.put(arr[i], i);
                }
            } else {
                count++;
            }

        }
        if (count == arr.length - 1) {
            System.out.println("0");
        } else {
            System.out.println(s);
        }
        sc.close();

    }
}
