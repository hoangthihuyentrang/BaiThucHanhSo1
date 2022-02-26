import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        int n;
        boolean res;
        Scanner sc;
        do {
            System.out.print("Input n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
        res = check_perfect_num(n);
        if(res) {
            System.out.println(n + " la so hoan thien ");
        }
        else {
            System.out.println(n + " la so khong hoan thien ");
        }
        sc.close();
    }
    public static boolean check_perfect_num(int n) {
        int sum_aliquots = 0;
        for(int i = 1; i < n; i++) {
            if(n%i == 0) {
            sum_aliquots += i;
            }
        }
        if(sum_aliquots == n) {
            return true;
        }
        else {
            return false;
        }
    }
}
