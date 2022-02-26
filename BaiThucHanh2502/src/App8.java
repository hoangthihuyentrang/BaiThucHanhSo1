import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int max=0,n;
            do
            {
                System.out.println("nhap vao so nguyen: ");
                n=sc.nextInt();
                if(n%5==0 && n>max)
                {
                    max=n;
                }
            }while(n!=0);
            System.out.println("so lon nhat trong cac so vua nhap ma chia het cho 5 la : "+max);
        }
        }
}