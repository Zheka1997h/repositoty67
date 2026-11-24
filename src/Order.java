import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    public String getCustomer() { return customer; }
    public Product[] getBasket() { return basket; }

    @Override
    public String toString() {
        return "Заказ[покупатель=" + customer + ", корзина="
                + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order other = (Order) obj;

        if (!Objects.equals(customer, other.customer)) {
            return false;
        }

        if (basket == null && other.basket == null) {
            return true;
        }
        if (basket == null || other.basket == null) {
            return false;
        }
        if (basket.length != other.basket.length) {
            return false;
        }

        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null || other.basket[i] == null) {
                if (basket[i] != other.basket[i]) {
                    return false;
                }
            } else if (!basket[i].equals(other.basket[i])) {
                return false;
            }
        }
        return true;
    }
}