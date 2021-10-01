import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        while (count * count <= n) {
            System.out.println(count * count);
            count++;
        }
    }
}