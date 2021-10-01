import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] i = new int[len];
        for (int j = 0; j < len; j++) {
            i[j] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int c : i) {
            if (c > n) {
                sum += c;
            }
        }
        System.out.println(sum);
    }
}