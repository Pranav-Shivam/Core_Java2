package Pratice;

public class Vehicle {
    public static void main(String[] args) {
        System.out.println("Sourabh Vehicle Info : \n");
        System.out.println("Bike Info : ");
        Bike bike=new Bike();
        bike.setBikeInfo();
        bike.getBikeInfo();
        System.out.println("\n");
        System.out.println("Car Info : ");
        Car car=new Car();
        car.setCarInfo();
        car.getCarInfo();
    }
}
