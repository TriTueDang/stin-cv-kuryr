import shipping.AirDelivery;
import shipping.BikeDelivery;
import delivery.Delivery;
import shipping.TruckDelivery;


public class Main {
    public static void main(String[] args) {

        Delivery d1 = new Delivery("CZ001", 10, new TruckDelivery());
        Delivery d2 = new Delivery("CZ002", 3, new BikeDelivery());
        Delivery d3 = new Delivery("CZ003", 5, new AirDelivery());

        System.out.println(d1.calculatePrice());
        System.out.println(d2.calculatePrice());
        System.out.println(d3.calculatePrice());


    }

}