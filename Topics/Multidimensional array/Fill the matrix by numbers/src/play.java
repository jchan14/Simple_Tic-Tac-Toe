import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] array = new int[][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Math.abs(i - j) + " ");
            }
//            System.out.println("");
        }
    }
}

