import java.util.Scanner;

public class SS2BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật.");
            System.out.println("2. Tính chu vi và diện tích hình tam giác.");
            System.out.println("3. Tính chu vi và diện tích hình tròn.");
            System.out.println("4. Thoát.");
            System.out.print("Chọn chức năng (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Tính chu vi và diện tích hình chữ nhật
                    System.out.print("Nhập chiều dài: ");
                    double length = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng: ");
                    double width = scanner.nextDouble();
                    double rectanglePerimeter = 2 * (length + width);
                    double rectangleArea = length * width;
                    System.out.println("Chu vi hình chữ nhật: " + rectanglePerimeter);
                    System.out.println("Diện tích hình chữ nhật: " + rectangleArea);
                    break;
                case 2:
                    // Tính chu vi và diện tích hình tam giác
                    System.out.print("Nhập độ dài cạnh a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Nhập độ dài cạnh b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Nhập độ dài cạnh c: ");
                    double c = scanner.nextDouble();
                    double trianglePerimeter = a + b + c;
                    double s = (a + b + c) / 2;
                    double triangleArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    System.out.println("Chu vi hình tam giác: " + trianglePerimeter);
                    System.out.println("Diện tích hình tam giác: " + triangleArea);
                    break;
                case 3:
                    // Tính chu vi và diện tích hình tròn
                    System.out.print("Nhập bán kính: ");
                    double radius = scanner.nextDouble();
                    double circlePerimeter = 2 * Math.PI * radius;
                    double circleArea = Math.PI * Math.pow(radius, 2);
                    System.out.println("Chu vi hình tròn: " + circlePerimeter);
                    System.out.println("Diện tích hình tròn: " + circleArea);
                    break;
                case 4:
                    // Thoát khỏi chương trình
                    System.out.println("Đã thoát khỏi ứng dụng.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
