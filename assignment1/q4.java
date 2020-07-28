import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int dish;
        while (true) {
            System.out.println(
                    "To order South Indian Dish, Enter 1  \nTo order North Indian Dish, Enter 2 \nTo order Rajasthani Dish, Enter 3 \nTo order Gujrati Dish, Enter 4 \nTo order Bengali Dish, Enter 5 \nTo order Desserts, Enter 6 \nTo Exit, Enter 7 ");
            System.out.println("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            dish = sc.nextInt();
            sc.nextLine();
            switch (dish) {
                case 1:
                    System.out.println("You get: \nIdli : 2 Pieces \nButter Cheese Dosa : 1 Pieces \nVada : 2 Pieces ");
                    break;
                case 2:
                    System.out.println("You get: \nIdli : 2 Pieces \nButter Cheese Dosa : 1 Pieces \nVada : 2 Pieces ");

                    break;
                case 3:
                    System.out.println("You get: \nDaal baati : 6 Pieces ");

                    break;
                case 4:
                    System.out.println("you get : \n puri :2 , shak : 4");
                    break;
                case 5:
                    System.out.println("You get: \n rasmalai , rashgulla (also opinions))");
                    break;
                case 6:
                    System.out.println("you get : \n sweet chocolate and strawberry");
                    break;
                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid");
                    break;
            }
        }
    }
}