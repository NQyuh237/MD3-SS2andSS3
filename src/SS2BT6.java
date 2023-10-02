import java.util.Scanner;

public class SS2BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int number = scanner.nextInt();
                    if (isEven(number)) {
                        System.out.println(number + " là số chẵn.");
                    } else {
                        System.out.println(number + " là số lẻ.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int num = scanner.nextInt();
                    if (isPrime(num)) {
                        System.out.println(num + " là số nguyên tố.");
                    } else {
                        System.out.println(num + " không là số nguyên tố.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int input = scanner.nextInt();
                    if (isDivisibleBy3(input)) {
                        System.out.println(input + " chia hết cho 3.");
                    } else {
                        System.out.println(input + " không chia hết cho 3.");
                    }
                    break;
                case 4:
                    System.out.println("Đã thoát chương trình.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDivisibleBy3(int input) {
        return input % 3 == 0;
    }
}