import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int largest = 0;
        int a;
        do {
            a = s.nextInt();
            largest = a >= largest ? a : largest;
        } while (a != 0);
        System.out.println(largest);
    }
}