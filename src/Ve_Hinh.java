import java.util.Scanner;

public class Ve_Hinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = Integer.parseInt(sc.nextLine());
        String ve = "";
        switch (a) {
            case 1:
                for (int i = 0; i <= 6; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 3 :
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 6; i >0; i--) {
                    for (int j = 0; j <i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("khong dung lua chon");
        }
    }
}
