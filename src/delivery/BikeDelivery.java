package delivery;

public class BikeDelivery implements ShippingMethod{

    private final double basePrice = 80;
    public double calculatePrice(double weight){
        if (weight <= 5){
            return basePrice;
        }else{
            throw new IllegalArgumentException("Weight exceeds the limit for bike delivery");
        }
    }
}
