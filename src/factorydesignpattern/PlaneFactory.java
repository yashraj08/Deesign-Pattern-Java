package factorydesignpattern;

public class PlaneFactory extends VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Plane("boeing",70,3,"white");
    }
}
