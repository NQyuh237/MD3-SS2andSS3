import java.util.Scanner;

public class SS3BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị đầu của khoảng: ");
        int start = scanner.nextInt();
        System.out.print("Nhập giá trị cuối của khoảng: ");
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) { // Kiểm tra nếu số là số chẵn
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là: " + sum);
        scanner.close();
    }
}