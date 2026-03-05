package delivery;

public class Delivery {

    private final ShippingMethod delivery_type;
    protected String trackingNumber;
    protected double weight;

    public Delivery(String trackingNumber, double weight, ShippingMethod delivery_type) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
        this.delivery_type = delivery_type;
    }

    public double calculatePrice(){
        return this.delivery_type.calculatePrice(weight);
    }
}
