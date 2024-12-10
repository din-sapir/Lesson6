import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ICustomer> customerList = new ArrayList<>();
        customerList.add(new StandardCustomer(1,"cust1"));
        customerList.add(new GoldCustomer(2,"cust2"));
        customerList.add(new StandardCustomer(3,"cust3"));
        customerList.add(new SilverCustomer(4,"cust4"));
        customerList.add(new SilverCustomer(5,"cust5"));
        customerList.add(new StandardCustomer(6,"cust6"));
        customerList.add(new SilverCustomer(7,"cust7"));
        customerList.add(new StandardCustomer(8,"cust8"));
        customerList.add(new GoldCustomer(9,"cust9"));
        customerList.add(new StandardCustomer(10,"cust10"));

        for (ICustomer customer : customerList) {
            System.out.println("Name: " + customer.getCustomerName() + " | 300: " + customer.getPriceForProduct(300) + " | 3800: " + customer.getPriceForProduct(3800));
        }
    }
}