package main;

import java.util.Scanner;
public class hinhtron{
        static void main(String[] args) {
        }
        class HinhTron {
            final float PI = 3.14f;
            float r;
            float chuvi;
            float dientich;
            public void nhapBanKinh() {
                System.out.println("Hãy nhập vào Bán kính Hình tròn: ");
                try (Scanner scanner = new Scanner(System.in)) {
                    r = scanner.nextFloat();
                }
            }
            void tinhChuVi() {
                chuvi = 2 * PI * r;
            }
            void tinhDienTich() {
                dientich = PI * r * r;
            }
            void inChuVi() {
                System.out.println("Chu vi Hình tròn: " + chuvi);
            }
            void inDienTich() {
                System.out.println("Diện tích Hình tròn: " + dientich);
            }
        }
        public void tinhChuVi() {
        }
        public void tinhDienTich() {
        }
        public void nhapBanKinh() {
        }
}
