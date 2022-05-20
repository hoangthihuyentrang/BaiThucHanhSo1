import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args) {
        HashSet<String> hashSetString = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        hashSetString.add("Wilson"); 
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        System.out.println("Cac phan tu trong hashSetString: " + hashSetString);
        System.out.println("Nhap so phan tu can xoa: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu can xoa: ");
            String name = scanner.nextLine();
            if(hashSetString.contains(name)) {
                hashSetString.remove(name);
                System.out.println("Xoa thanh cong.");
            }
            else 
                System.out.println("xoa khong thanh cong");
        }
        System.out.println("Cac phan tu trong hashSetString: " + hashSetString);
    }
}