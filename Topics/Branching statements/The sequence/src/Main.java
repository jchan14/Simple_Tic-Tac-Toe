import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count = 1;
        boolean stop = false;
        int n = 1;
        while (!stop) {
            for (int i = 0; i < n; i++) {
                System.out.print(n + " ");
                if (count >= a) {
                    stop = true;
                    break;
                }
                count++;
            }
            n++;
        }
    }
}

//import java.util.*;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        int n = s.nextInt();
//        int count = 0;
//        for (int i = 1; count < n; i++) {
//            for (int j = i, rNum = i; j > 0; j--) {
//                System.out.print(rNum + " ");
//                count++;
//                if (count >= n) {
//                    break;
//                }
//            }
//        }
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int a = 1;
//        int b = 0;
//        while (b < n) {
//            int c = 0;
//            while (c < a && b < n) {
//                System.out.println(a + " ");
//                c++;
//                b++;
//            }
//            a++;
//        }
//    }
//}