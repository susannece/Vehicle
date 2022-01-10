package se.lexicon.susanne;


public class App 
{
    public static void main( String[] args )
    {
        Car car1 = new Car(2342, "abc678", "Volvo", 4, 6 );
        car1.drive();

        Motorcycle mc1 = new Motorcycle(6584,"gkd816", "Yamaha", "Dragstar");
        mc1.drive();

        Truck truck1 = new Truck(8423,"dhy452", "Scania", 110, 8900);
        truck1.drive();

    }
}
