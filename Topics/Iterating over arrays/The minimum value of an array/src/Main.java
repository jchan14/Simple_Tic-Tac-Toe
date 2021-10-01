import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int smallest = array[len - 1];

        for (int i : array) {
            smallest = smallest < i ? smallest : i;
        }
        System.out.println(smallest);
    }
}