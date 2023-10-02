import java.util.Scanner;

public class SS3BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
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
                    int primeNumber = scanner.nextInt();
                    if (isPrime(primeNumber)) {
                        System.out.println(primeNumber + " là số nguyên tố.");
                    } else {
                        System.out.println(primeNumber + " không phải là số nguyên tố.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int divisibleBy3Number = scanner.nextInt();
                    if (isDivisibleBy3(divisibleBy3Number)) {
                        System.out.println(divisibleBy3Number + " chia hết cho 3.");
                    } else {
                        System.out.println(divisibleBy3Number + " không chia hết cho 3.");
                    }
                    break;
                case 4:
                    System.out.println("Ứng dụng đã kết thúc.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    // Hàm kiểm tra số chẵn lẻ
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hàm kiểm tra số chia hết cho 3
    public static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }
}
