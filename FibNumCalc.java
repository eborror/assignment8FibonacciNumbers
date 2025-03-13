import java.util.Scanner;

public class FibNumCalc {
    public static void main(String[] args) throws Exception {
        int userInput, a = 0, b = 1, c = 0;
        System.out.println("What term of the Fibonacci sequence would you like to know?");
        try (Scanner sc = new Scanner(System.in)) {
            userInput = sc.nextInt();
        }
        for (int i = 3; i < userInput+1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Term " + userInput + " = " + c);
    }
}
