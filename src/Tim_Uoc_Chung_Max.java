import java.util.Scanner;

public class Tim_Uoc_Chung_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("nhap so b: ");
        int b = Integer.parseInt(sc.nextLine());
        int c = 0;
        if (a == 0 && b == 0) {
            System.out.println(" khong co UCLN");
        } else if (a == 0) {
            for (int i = 1; i < b; i++) {
                if (b % i == 0) {
                    c = i;
                }
            }
            System.out.println("UCLN la: " + c);
        } else if (b == 0) {
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    c = i;
                }
            }
            System.out.println("UCLN la: " + c);
        } else {
            if (a < b) {
                for (int i = 1; i < a; i++) {
                    if (a % i == 0) {
                        c = i;
                    }
                }
                System.out.println("UCLN la: " + c);
            } else {
                for (int i = 1; i < b; i++) {
                    if (b % i == 0) {
                        c = i;
                    }
                }
                System.out.println("UCLN la: " + c);
            }
        }

    }
}