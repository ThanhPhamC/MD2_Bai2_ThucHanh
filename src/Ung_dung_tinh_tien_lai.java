import java.util.Scanner;

public class Ung_dung_tinh_tien_lai {
    public static void main(String[] args) {
        float soTienlai = 0F;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so tien gui: ");
        float soTien = Float.parseFloat(sc.nextLine());
        System.out.print("nhap so thang gui: ");
        float soThang = Float.parseFloat(sc.nextLine());
        System.out.print("nhap lai suat gui: ");
        float laiSuat = Float.parseFloat(sc.nextLine());
        for (int i = 0; i < soThang; i++) {
            soTienlai = soThang * soTien * (laiSuat / 100) / 12;
        }
        System.out.print("Tong so tien nhan la: " + (soTien + soTienlai));
    }
}
