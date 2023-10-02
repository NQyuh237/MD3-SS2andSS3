import java.util.Scanner;

public class SS2BT8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;

        while (true) {
            System.out.print("Nhập vào cạnh thứ nhất: ");
            side1 = input.nextDouble();
            System.out.print("Nhập vào cạnh thứ hai: ");
            side2 = input.nextDouble();
            System.out.print("Nhập vào cạnh thứ ba: ");
            side3 = input.nextDouble();

            if (isValidTriangle(side1, side2, side3)) {
                double perimeter = calculatePerimeter(side1, side2, side3);
                double area = calculateArea(side1, side2, side3);

                System.out.println("Chu vi của tam giác là: " + perimeter);
                System.out.println("Diện tích của tam giác là: " + area);

                break; // Kết thúc vòng lặp khi nhập đúng tam giác
            } else {
                System.out.println("Các giá trị không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        // Kiểm tra điều kiện tam giác
        return side1 > 0 && side2 > 0 && side3 > 0 &&
                side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static double calculateArea(double side1, double side2, double side3) {
        // Sử dụng công thức Heron để tính diện tích tam giác
        double s = calculatePerimeter(side1, side2, side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}