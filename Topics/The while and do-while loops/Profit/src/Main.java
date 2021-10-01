import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double m = s.nextDouble();
        double p = s.nextDouble();
        double k = s.nextDouble();
        int y = 0;

        while (m < k) {
            m = m * (1 + p / 100);
            y++;
        }

        System.out.println(y);
    }
}