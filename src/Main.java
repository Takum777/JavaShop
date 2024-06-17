
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Cart cart = new Cart();

        //Creating categories
        Category furniture = new Category(1, "Furniture");
        Category electronics = new Category(2, "Electronics");

        //Creating products
        Product product1 = new Product(1, "Couch", 1879.99, "A soft couch", furniture);
        Product product2 = new Product(2, "Conditioner", 4439.99, "Regulated conditioner", electronics);
        Product product3 = new Product(3, "Cabinet", 899.99, "Where you get the money? In cabinet", furniture);
        Product product4 = new Product(4, "Lamp", 659.99, "A bright, shining lamp", electronics);
        Product product5 = new Product(5, "Clock", 239.99, "Electronic clock with alarm", electronics);

        //Cycle for program work
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1 - Get the list of products");
            System.out.println("2 - Add product to cart");
            System.out.println("3 - Remove product from cart");
            System.out.println("4 - See the cart");
            System.out.println("5 - Make an order");
            System.out.println("0 - Exit shop");

            int choiceCart = scanner.nextInt();
            switch(choiceCart) {
                    //Output of all products
                    case 1:
                    System.out.println(product1);
                    System.out.println(product2);
                    System.out.println(product3);
                    System.out.println(product4);
                    System.out.println(product5);
                    break;

                    //Adding products
                    case 2:
                    System.out.println("Input ID for the product you want to add");
                    int addId = scanner.nextInt();
                    switch(addId) {
                        case 1: cart.addProduct(product1); break;
                        case 2: cart.addProduct(product2); break;
                        case 3: cart.addProduct(product3); break;
                        case 4: cart.addProduct(product4); break;
                        case 5: cart.addProduct(product5); break;
                        default: System.out.println("There's no product with such ID!");
                    }
                    break;

                    //Removing products
                    case 3:
                    System.out.println("Input ID for the product you want to remove");
                    int removeId = scanner.nextInt();
                    switch(removeId) {
                        case 1: cart.removeProduct(product1); break;
                        case 2: cart.removeProduct(product2); break;
                        case 3: cart.removeProduct(product3); break;
                        case 4: cart.removeProduct(product4); break;
                        case 5: cart.removeProduct(product5); break;
                        default: System.out.println("There's no product with such ID!");
                    }

                    //Review of cart
                    case 4:
                    System.out.println(cart);
                    break;

                    //Making order
                    case 5:
                    if (cart.getProducts().isEmpty()) {
                        System.out.println("Cart is empty");
                    }
                    else {
                        Order order = new Order(cart);
                        System.out.println("Order was made");
                        System.out.println(order);
                        cart.clear();
                    }
                    break;

                    //Exit from program
                    case 0:
                    System.out.println("Thank you for using our shop");
                    return;

                    //Incorrect option
                    default:
                    System.out.println("No such option!");
            }
        }
    }
}