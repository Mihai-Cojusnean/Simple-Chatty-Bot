import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int nrBridges = scanner.nextInt();
        int[] heightBridges = new int[nrBridges];

        for (int i = 0; i < nrBridges; i++) {
            heightBridges[i] = scanner.nextInt();
            if (height >= heightBridges[i]) {
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            } else if (i == nrBridges - 1) {
                System.out.println("Will not crash");
            }
        }
    }
}