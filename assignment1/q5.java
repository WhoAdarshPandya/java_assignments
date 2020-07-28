import java.util.*;

public class q5 {
    public static void main(String[] args) {
        int ch;
        double res, l, b, h, r;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1. Area of right triangle (area= ½*b*h) \n2. Area of Square (area=l*l) \n3. Area of Rectangle (area=l*b) \n4. Area of circle (area= 3.14*r*r) \n5. Exit ");
            System.out.println("Enter your choice : ");
            ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Enter B: ");
                    b = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter H: ");
                    h = sc.nextInt();
                    sc.nextLine();
                    res = (0.5 * b * h);
                    System.out.println("result is : " + res);
                    break;
                case 2:
                    System.out.println("Enter L: ");
                    l = sc.nextInt();
                    sc.nextLine();
                    res = l * l;
                    System.out.println("result is : " + res);

                    break;
                case 3:
                    System.out.println("Enter L: ");
                    l = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter B: ");
                    b = sc.nextInt();
                    sc.nextLine();
                    res = l * b;
                    System.out.println("result is : " + res);

                    break;
                case 4:
                    System.out.println("Enter R: ");
                    r = sc.nextInt();
                    sc.nextLine();
                    res = 3.14 * r * r;
                    System.out.println("result is : " + res);

                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid");
                    break;
            }
        }
    }
}