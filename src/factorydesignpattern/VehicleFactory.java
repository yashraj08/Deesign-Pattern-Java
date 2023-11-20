package factorydesignpattern;

abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void design(){
        Vehicle vehicle = createVehicle();
        vehicle.createEngine();
        vehicle.createExterior();
        vehicle.createInterior();

        vehicle.display();

    }
}
