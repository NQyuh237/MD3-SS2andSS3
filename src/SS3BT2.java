import java.util.Scanner;

public class SS3BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Hiển thị menu
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // In hình chữ nhật
                    int width, height;
                    System.out.print("Enter width: ");
                    width = scanner.nextInt();
                    System.out.print("Enter height: ");
                    height = scanner.nextInt();
                    printRectangle(width, height);
                    break;
                case 2:
                    // In hình tam giác vuông
                    printSquareTriangle();
                    break;
                case 3:
                    // In hình tam giác cân
                    int n;
                    System.out.print("Enter the number of lines: ");
                    n = scanner.nextInt();
                    printIsoscelesTriangle(n);
                    break;
                case 4:
                    // Thoát chương trình
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // In dấu *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
