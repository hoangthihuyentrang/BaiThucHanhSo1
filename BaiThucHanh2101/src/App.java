import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double hesoA, hesoB, hesoC, delta;
        double x1,x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao he so A: ");
        hesoA = sc.nextDouble();
        System.out.println("Nhap vao he so B: ");
        hesoB = sc.nextDouble();
        System.out.println("Nhap vao he so C: ");
        hesoC = sc.nextDouble();
        delta = hesoB*hesoB - 4*hesoA*hesoC;
        if (delta<0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else {
            if (delta==0) {
                x1 = -hesoB/(2*hesoA);
                System.out.println("Phuong trinh co nghiem kep: x= "+ x1);
            } else {
                x1 = (-hesoB + Math.sqrt(delta)) / (2*hesoA);
                x2 = (-hesoB - Math.sqrt(delta)) / (2*hesoA);
                System.out.println("Phuong trinh co hai nghiem: x1= "+ x1 + " va x2 = " + x2);
            }
        }
    }
}