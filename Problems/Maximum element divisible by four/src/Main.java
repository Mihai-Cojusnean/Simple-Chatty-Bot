import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 4 == 0 && numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}