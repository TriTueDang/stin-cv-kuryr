package delivery;

public class AirDelivery implements ShippingMethod{
    private final double basePrice = 300;
    public double calculatePrice(double weight) {
        return basePrice + 25*weight;
    }
}
