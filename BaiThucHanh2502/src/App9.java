import java.util.Scanner;
public class App9 {
   public static void main(String[] args)
   {
      int n;
      int[] soNguyen;
      try (Scanner sc = new Scanner(System.in)) {
         
         System.out.println("Nhập vào n:");
         n = sc.nextInt();
         soNguyen = new int[n];
         for (int i = 0; i < n; i++)
         {
            System.out.println("Nhập vào số nguyên:");
            soNguyen[i] = sc.nextInt();
         }
      }
      System.out.println(" trước khi đảo ngược: ");
      for (int i = 0; i < n; i++)
         System.out.print(soNguyen[i] + " ");
      for (int i = 0; i < n/2; i++)
      {
         int empty;
         empty = soNguyen[i];
         soNguyen[i] = soNguyen[n-i-1];
         soNguyen[n-i-1] = empty;
      }
      System.out.println("\nMảng sau khi đảo ngược: ");
      for (int i = 0; i < n; i++)
      System.out.print(soNguyen[i] + " ");
   }
}