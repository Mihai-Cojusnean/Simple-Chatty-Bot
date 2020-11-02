import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (true) {
            if (number == 0) {
                break;
            } else {
                System.out.println(number % 2 == 0 ? "even" : "odd");
            }
        }
    }
}