import java.util.Scanner;

public class SS2TH1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a Equation 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        if (a!=0) { // Nếu a khác 0
            double x = (c - b) / a; // Phương trình có nghiệm duy nhất
            System.out.println("Equation pass with x= " + x);
        }else { // Nếu a = 0
            if (b==c){// Nếu b = c thì phương trình vô số nghiệm
                System.out.println("The solution is all x!");
//            }else { // Nếu b khác c thì phương trình vô nghiệm
                System.out.println("No solution!");
            }
        }
    }
}
