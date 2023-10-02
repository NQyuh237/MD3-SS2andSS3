public class SS2BT3 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for (int number = 2; number < 100; number++){
            boolean isPrime = true;
            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++){
                if (number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(number + " ");
            }
        }
    }
}
