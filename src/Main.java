import composition.Computer;
import delivery.AirDelivery;
import delivery.BikeDelivery;
import delivery.Delivery;
import delivery.TruckDelivery;
import employee.Employee;
import inheritance.Animal;
import inheritance.Dog;
import inheritance.RobotDog;
import wrapping.BankAccount;
import wrapping.User;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;


public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//
//        BankAccount acc = new BankAccount(200);
//        System.out.println(acc.getBalance());
//
//        User user = new User("adam", "password");
//        boolean validate_passwd = user.checkPassword(null);
//        System.out.println(validate_passwd);
//        boolean out =  user.changePassword("password", "newpassword");
//        System.out.println(out);
//        try {
//            MessageDigest digest = MessageDigest.getInstance("SHA-256");
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//
//        // inheritance
//        Animal animal = new Dog("red");
//        animal.makeSound();
//
//        RobotDog robotDog =  new RobotDog("red");
//        robotDog.makeSound();
//
//        // composition
//        Computer computer = new Computer("i7");
//        computer.start();
//
//        // polymorphism
//        Employee employee;


        Delivery d1 = new Delivery("CZ001", 10, new TruckDelivery());
        Delivery d2 = new Delivery("CZ002", 3, new BikeDelivery());
        Delivery d3 = new Delivery("CZ003", 5, new AirDelivery());

        System.out.println(d1.calculatePrice());
        System.out.println(d2.calculatePrice());
        System.out.println(d3.calculatePrice());


    }

}