import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int maxn = Integer.MIN_VALUE;
        int maxx = 0;
        int maxy = 0;

        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = s.nextInt();
                if (maxn < array[i][j]) {
                    maxn = array[i][j];
                    maxx = i;
                    maxy = j;
                }
            }
        }
        System.out.println(maxx + " " + maxy);
    }
}