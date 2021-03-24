import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int current = 0;
        int before = 0;
        int score = 0;
        Scanner sc = new Scanner(System.in);
        before = sc.nextInt();
        while (sc.hasNext()) {
            current = sc.nextInt();

            if (current - before > score) {
                score = current - before;
            }

        }

    }
}