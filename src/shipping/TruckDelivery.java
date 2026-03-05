package shipping;

public class TruckDelivery implements ShippingMethod {

    private final double basePrice = 100;
    public double calculatePrice(double weight) {

        return basePrice + weight * 10;
    }

}
