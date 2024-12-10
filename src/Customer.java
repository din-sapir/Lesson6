public abstract class Customer implements ICustomer {

    //state
    protected String name;
    protected int id;

    //constructor
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //behaviour
    @Override
    public String getCustomerName() {
        return this.name;
    }

    @Override
    public abstract double getPriceForProduct(double fullPrice);
}
