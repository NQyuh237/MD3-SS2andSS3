import java.util.Scanner;

public class SS2BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bắt đầu của khoảng: ");
        int start = scanner.nextInt();
        System.out.println("Nhập số kết thúc của khoảng: ");
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = start; i <= end ; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là " + sum);
        scanner.close();
    }
}
