import java.util.Scanner;
public class App10 {
     public static void main(String[] args){
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhập số lượng tử của mảng: ");
             int n = sc.nextInt(); //số phần tử của mảng
             int []m = new int[n];
             for(int i=0; i<n; i++){
                 System.out.println("Nhập phần tử thử: ");
                 m[i] = sc.nextInt();
             }
            System.out.println("Nhập số nguyên bất kỳ: ");
            int x = sc.nextInt();
            int dem = 0;
            for(int i=0; i<0; i++ ){
            
                if(m[i] == x){
                    dem = dem + 1;
            }
        }
     
   System.out.print("Số lầ xuất hiện của "+x+" là: " +dem);
     for(int i=0; i<n-1; i++) {
              for(int j=i+1;j<n;j++){

              }
     }
        }

    
    }
}
