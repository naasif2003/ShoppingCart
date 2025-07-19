import java.util.Scanner;

public class ShoppingCart{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Food;
        double price = 0.0;
        int quantity;
        double total = 0.0;
        System.out.print("Enter the Food:");
        Food = input.nextLine();
        System.out.print("Enter the Price:");
        price = input.nextDouble();
        System.out.print("Enter the number of quantity:");
        quantity = input.nextInt();
        total = price * quantity;
        System.out.println("The Food ordered was:" + Food);
        System.out.println("The Price is:" + price + "$");
        System.out.println("The number unit bought is:" + quantity);
        System.out.println("The total price is:" + total +"$");
        input.close();
    }
     
    
}
