import java.util.Scanner;

public class SS3BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        while (true) {
            System.out.println("Nhập vào độ dài cạnh a: ");
            a = scanner.nextDouble();
            System.out.println("Nhập vào độ dài cạnh b: ");
            b = scanner.nextDouble();
            System.out.println("Nhập vào độ dài cạnh c: ");
            c = scanner.nextDouble();

            if (isValidTriangle(a, b, c)) {
                double chuVi = tinhChuVi(a, b, c);
                double dienTich = tinhDienTich(a, b, c);

                System.out.println("Chu vi của tam giác là: " + chuVi);
                System.out.println("Diện tích của tam giác là: " + dienTich);
                break;
            } else {
                System.out.println("Lỗi: 3 cạnh không thoả mãn điều kiện của tam giác. Vui lòng nhập lại.");
            }
        }
        scanner.close();
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
    }

    public static double tinhChuVi(double a, double b, double c) {
        return a + b + c;
    }

    public static double tinhDienTich(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
