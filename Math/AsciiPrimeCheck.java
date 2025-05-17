import java.util.Scanner;
class rough {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (isPrime(ch)) {
                sum += ch;
                ans += s.charAt(i);
            }
        }
        System.out.println(ans + ":" + sum);
      sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }

        }
        return true;
    }
}
