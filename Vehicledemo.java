abstract class Vehicle{
    abstract double calculateSpeed();
    abstract double calculateVelocity();
}
class Car extends Vehicle{
    private double distance;
    private double displacement;
    private double time;

    Car (double distance, double displacement, double time){
        this.distance = distance;
        this.displacement = displacement;
        this.time = time;

    }
    double calculateSpeed (){
        return distance/time;
    }
    double calculateVelocity (){
        return displacement/time;
    }
}
class Bike extends Vehicle{
    private double distance;
    private double displacement;
    private double time;

    Bike (double distance, double displacement, double time){
        this.distance = distance;
        this.displacement = displacement;
        this.time = time;

    }
    double calculateSpeed (){
        return distance/time;
    }
    double calculateVelocity (){
        return displacement/time;
    }
}
public class Vehicledemo {
    public static void main(String[] args) {
        Vehicle car = new Car(100,80,20);
        Vehicle bike = new Bike(60,40,30);

        System.out.println("Car speed: " + car.calculateSpeed () );
        System.out.println("Car velocity: " + car.calculateVelocity());

        System.out.println("Bike speed: " + bike.calculateSpeed ());
        System.out.println("Bike velocity: " + bike.calculateVelocity ());
    }
}