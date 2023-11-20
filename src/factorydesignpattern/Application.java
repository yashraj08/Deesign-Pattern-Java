package factorydesignpattern;

import java.util.Scanner;

public class Application {
    VehicleFactory vehicleFactory;
    public static void main(String args[]) throws Exception {
        Application application = new Application();
        System.out.println("Factory Design Pattern");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of Vehicle you want");
        String vehicleType = sc.nextLine();

        switch (vehicleType.toLowerCase()){
            case "car": application.vehicleFactory = new CarFactory(); break;
            case "truck": application.vehicleFactory = new TruckFactory();break;
            case "plane": application.vehicleFactory = new PlaneFactory();break;
            default: throw new Exception("Invalid Input");
        }
        application.vehicleFactory.design();
    }
}
