import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int sum = 0;
        do {
            a = s.nextInt();
            sum += a;
        } while (a != 0);
        System.out.println(sum);
    }
}