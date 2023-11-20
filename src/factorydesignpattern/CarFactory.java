package factorydesignpattern;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car("ford",4,4,"Red");
    }
}
