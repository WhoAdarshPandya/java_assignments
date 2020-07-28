import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int noOfDay;
        while (true) {
            System.out.println("Enter the day you want to know : ");
            Scanner sc = new Scanner(System.in);
            noOfDay = sc.nextInt();
            sc.nextLine();
            switch (noOfDay) {
                case 1:
                    System.out.println("First day of the week is Sunday  ");
                    break;
                case 2:
                    System.out.println("second day of the week is Monday  ");
                    break;
                case 3:
                    System.out.println("third day of the week is Tuesday  ");
                    break;
                case 4:
                    System.out.println("Fourth day of the week is wednesday  ");
                    break;
                case 5:
                    System.out.println("Fifth day of the week is thursday ");
                    break;
                case 6:
                    System.out.println("Sixth day of the week is friday  ");
                    break;
                case 7:
                    System.out.println("secenth day of the week is Saturday  ");
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("invalid");
                    break;
            }
        }
    }
}