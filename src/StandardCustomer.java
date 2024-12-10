public class StandardCustomer extends Customer {

    //constructor
    public StandardCustomer(int id, String name) {
        super(id, name);
    }

    //behaviour
    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice;
    }
}
