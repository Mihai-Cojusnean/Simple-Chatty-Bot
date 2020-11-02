import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        for (int i = 0; i < 5; i++) {
            for (char letter = 'a'; letter <= 'f'; letter++) {
                if (letter < 'f') {
                    continue;
                }
                System.out.println(letter);
            }
        }
    }
}
