import java.text.DecimalFormat;
import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        int n, sum = 0, number;
        float avgNumber;
        Scanner sc = new Scanner(System.in);
         
        // làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
         
        System.out.println("Nhập vào số các số nguyên có trong dãy: ");
        n = sc.nextInt();
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhập số thứ " + count + ": ");
            number = sc.nextInt();
            sum += number;
        }
        avgNumber = (float) sum / n;
        System.out.println("Trung bình cộng = " + decimalFormat.format(avgNumber));
    }
}
