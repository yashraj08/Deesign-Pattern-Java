package factorydesignpattern;

public class Plane extends Vehicle {
    public Plane(String brand , int seats , int tyres, String color ){
        super();
        this.setBrand(brand);
        this.setSeats(seats);
        this.setColor(color);
        this.setTyres(tyres);
        this.setHasWings(true);
        this.setVehicleType("Plane");
    }
    @Override
    public void createEngine() {
        System.out.println("Plane Engine Created");

    }

    @Override
    public void createExterior() {
        System.out.println("Plane Exterior Created");
    }

    @Override
    public void createInterior() {
        System.out.println("Plane Interior Created");
    }
}
