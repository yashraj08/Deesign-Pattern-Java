package factorydesignpattern;

public class TruckFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Truck("Tata",3,6,"Orange");
    }
}
