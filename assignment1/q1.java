
import java.util.Scanner;

public class q1 {
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int mult(int n1, int n2) {
        return n1 * n2;
    }

    public static int div(int n1, int n2) {
        return n1 / n2;
    }

    public static int combine(int n1, int n2) {
        return (n1 * n2) - n1;
    }

    public static void main(String[] args) {
        int n1, n2, ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1 : ");
        n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter n2 : ");
        n2 = sc.nextInt();
        sc.nextLine();
        // System.out.println("n1 is " + n1 + "n2 is " + n2);
        while (true) {
            System.out.println("1. sum of two");
            System.out.println("2. sub of two");
            System.out.println("3. mult of two");
            System.out.println("4. div of two");
            System.out.println("5. mult of two ad sub from 1st num ");
            System.out.println("6. exit");
            System.out.println("Enter your choice : ");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("sum of two number is : " + sum(n1, n2));
                    break;
                case 2:
                    System.out.println("sub of two number is : " + sub(n1, n2));
                    break;
                case 3:
                    System.out.println("mult of two number is : " + mult(n1, n2));
                    break;
                case 4:
                    System.out.println("div of two number is : " + div(n1, n2));
                    break;
                case 5:
                    System.out.println("answer  of two operation is : " + combine(n1, n2));
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("invalid choice...");
                    break;
            }
        }
    }
}