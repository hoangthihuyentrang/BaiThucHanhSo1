import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception{
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiem tra so duong a co phai la so nguyen to khong.");
        do {
            System.out.println("a= ");
            a = sc.nextInt();
            if(a < 0)
                System.out.println("Gia tri khong hop le. Vui long nhap lai.");
        } while (a < 0);

        if(SNT(a) == false)
            System.out.println(a + " khong la so nguyen to.");
        else
            System.out.println(a + " la so nguyen to.");
        sc.close();
    }
    public static boolean SNT(int a){
        if (a < 2){
            return false;
        }          
        for (int i = 2; i < (a - 1); i++){
            if (a % i == 0){
                return false;
            }   
        }
        return true;
    }
}
