import java.util.List;
import java.util.ArrayList;
public class Order {
    private List <Product> products;
    private double totalPrice;
    private String orderStatus;

    public Order(Cart cart) {
        this.products = new ArrayList<>(cart.getProducts());
        this.totalPrice = cart.getTotalPrice();
        this.orderStatus = "New";
    }
    public void setStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Your order: \n");
        for (Product product : products) {
            sb.append(product.toString()).append("\n");
        }
        sb.append("Total cost: ").append(totalPrice).append("\n");
        sb.append("Order status: ").append(orderStatus);
        return sb.toString();
    }

}
