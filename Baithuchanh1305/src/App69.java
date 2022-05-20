import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
public class App69 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        treeSetInteger.add(0);
        treeSetInteger.add(1);
        treeSetInteger.add(2);
        System.out.println("Cac phan tu trong treeSetInteger: " + treeSetInteger);
        System.out.print("Nhap phan tu can them: ");
        number = sc.nextInt();
        if(treeSetInteger.contains(number))
            System.out.println("Phan tu " + number + " da ton tai.");
        else {
            treeSetInteger.add(number);
            System.out.println("Them thanh cong.");
            System.out.print("Cac phan tu trong treeSetInteger sau khi them: " + treeSetInteger);
        }
    }
}