import java.util.Scanner;

public class SS3BT7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát");
            System.out.print("Chọn một chức năng (1-4): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Tính chu vi và diện tích hình chữ nhật
                    System.out.print("Nhập chiều dài: ");
                    double dai = input.nextDouble();
                    System.out.print("Nhập chiều rộng: ");
                    double rong = input.nextDouble();
                    double chuViHCN = 2 * (dai + rong);
                    double dienTichHCN = dai * rong;
                    System.out.println("Chu vi hình chữ nhật là: " + chuViHCN);
                    System.out.println("Diện tích hình chữ nhật là: " + dienTichHCN);
                    break;
                case 2:
                    // Tính chu vi và diện tích hình tam giác
                    System.out.print("Nhập độ dài cạnh a: ");
                    double a = input.nextDouble();
                    System.out.print("Nhập độ dài cạnh b: ");
                    double b = input.nextDouble();
                    System.out.print("Nhập độ dài cạnh c: ");
                    double c = input.nextDouble();
                    double chuViTamGiac = a + b + c;
                    double p = chuViTamGiac / 2; // Nửa chu vi
                    double dienTichTamGiac = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Công thức Heron
                    System.out.println("Chu vi hình tam giác là: " + chuViTamGiac);
                    System.out.println("Diện tích hình tam giác là: " + dienTichTamGiac);
                    break;
                case 3:
                    // Tính chu vi và diện tích hình tròn
                    System.out.print("Nhập bán kính hình tròn: ");
                    double banKinh = input.nextDouble();
                    double chuViHinhTron = 2 * Math.PI * banKinh;
                    double dienTichHinhTron = Math.PI * Math.pow(banKinh, 2);
                    System.out.println("Chu vi hình tròn là: " + chuViHinhTron);
                    System.out.println("Diện tích hình tròn là: " + dienTichHinhTron);
                    break;
                case 4:
                    // Thoát
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    // Lựa chọn không hợp lệ
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 4);

        input.close();
    }
}