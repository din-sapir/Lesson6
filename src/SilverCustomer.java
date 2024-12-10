public class SilverCustomer extends Customer {

    //constructor
    public SilverCustomer(int id, String name) {
        super(id, name);
    }

    //behaviour
    @Override
    public double getPriceForProduct(double fullPrice) {
        if (fullPrice > 500) {
            return fullPrice * 0.85;
        } else {
            return fullPrice;
        }
    }
}
