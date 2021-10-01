import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] i = new double[n];
        double[] pt = new double[n];

        for (int j = 0; j < n; j++) {
            i[j] = scanner.nextInt();
        }

        for (int j = 0; j < n; j++) {
            pt[j] = scanner.nextInt();
        }

        double highestTax = -1d;
        int company = 0;

        for (int j = 0; j < n; j++) {
            double thisTax = i[j] * pt[j];
            if (thisTax > highestTax) {
                highestTax = thisTax;
                company = j;
            }
        }

        System.out.println(company + 1);
    }
}