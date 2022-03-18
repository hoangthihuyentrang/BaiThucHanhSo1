package main;

import java.util.Scanner;
 
    public class hinhcn{
        protected double chieuDai, chieuRong, chuVi, dienTich;
        Scanner scanner = new Scanner(System.in);
        private int dai;
        private int rong;
        private String cv;
        private String dt;
         
        public void nhap() {
            do {
                System.out.println("Nhập chiều dài hình chữ nhật: ");
                chieuDai = scanner.nextDouble();
                System.out.println("Nhập chiều rộng hình chữ nhật: ");
                chieuRong = scanner.nextDouble();
            } while (chieuDai < chieuRong);
        }
         
        public void hienThi() {
            System.out.println("Chiều dài và chiều rộng của hình chữ nhật lần lượt là "
                    + chieuDai + " và " + chieuRong);
        }
         
        public double tinhChuVi() {
            chuVi = (dai + rong) * 2;
            return chuVi;
        }
         
        public double tinhDienTich() {
            dienTich = dai * rong;
            return dienTich;
        }
         
        public void hienThiChuViVaDienTich() {
            System.out.println("Chu vi hình chữ nhật = " + cv);
            System.out.println("Diện tích hình chữ nhật = " + dt);
        }
    }