public class SS3BT5 {
    public static void main(String[] args) {
        int N = 1;

        while (true) {
            if (isMultiple(N, 5) && isMultiple(N, 7) && isMultiple(N, 11)) {
                System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5, 7 và 11 là: " + N);
                break;
            }
            N++;
        }
    }

    // ktra xem một số có chia hết cho một số khác hay không
    public static boolean isMultiple(int number, int divisor) {
        return number % divisor == 0;
    }
}
