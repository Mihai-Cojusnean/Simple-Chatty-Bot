import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int nrDeCompanii = scanner.nextInt();
        int[] companiile = new int[nrDeCompanii];
        int[] venit = new int[nrDeCompanii];
        int[] procentaj = new int[nrDeCompanii];

        for (int i = 0; i < nrDeCompanii; i++){
            companiile[i] = scanner.nextInt();
        }

        for (int i = 0; i < nrDeCompanii; i++){
            venit[i] = scanner.nextInt();
        }

        for (int i = 0; i < nrDeCompanii; i++){
            ve[i] = scanner.nextInt();
        }
        System.out.println();
    }
}
