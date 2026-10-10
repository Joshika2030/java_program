import java.util.Scanner;
class mileagecalculator {

    
    void mileage(double distance, double fuel) {
        double result = distance / fuel;
        System.out.println("Mileage: " + result + " km/l");
    }

   
    void cost(double distance, double mileage, double price) {
        double fuelNeeded = distance / mileage;
        double totalCost = fuelNeeded * price;
        System.out.println("Fuel required: " + fuelNeeded + " litres");
        System.out.println("Total fuel cost: Rs. " + totalCost);
    }


    void fuel(double distance, double mileage) {
        double fuelNeeded = distance / mileage;
        System.out.println("Fuel required: " + fuelNeeded + " litres");
    }
}

public class mileage {
    public static void main(String[] args) {
        mileagecalculator c = new mileagecalculator();

        c.mileage(30, 2);
        c.cost(30, 15.0, 108);
        c.fuel(40, 10);
    }
}