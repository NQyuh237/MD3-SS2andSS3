import java.util.Scanner;
// Import lớp Scanner từ gói java.util để sử dụng cho việc nhập dữ liệu từ bàn phím.

public class SS2BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần hiển thị: ");
        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;
        // Khởi tạo biến count và N để theo dõi số lượng số nguyên tố và số hiện tại.
        System.out.println(numbers + " số nguyên tố đầu tiên là:");
        // In ra màn hình thông báo số nguyên tố đầu tiên sẽ được hiển thị.
        while (count < numbers){
            // Bắt đầu vòng lặp while để tìm và hiển thị số nguyên tố.
            boolean isPrime = true;
            // Khai báo và khởi tạo biến boolean isPrime để kiểm tra xem số hiện tại có phải là số nguyên tố hay không.
            for (int divisor = 2; divisor <= Math.sqrt(N) ; divisor++) {
                // Vòng lặp for để kiểm tra số nguyên tố.
                if (N % divisor == 0){
                    isPrime = false;
                    // Nếu số hiện tại chia hết cho divisor (không phải là số nguyên tố), isPrime được gán giá trị false.
                }
            }
            if (isPrime){
                System.out.print(N + " ");
                count++;
                // Nếu isPrime là true, in số hiện tại ra màn hình và tăng biến count lên 1.
            }
            N++;
            // Tăng giá trị của N để kiểm tra số nguyên tố tiếp theo.
        }
        scanner.close();
    }
}
