package factorydesignpattern;

public class Truck extends Vehicle{
    public Truck(String brand , int seats , int tyres, String color ){
        super();
        this.setBrand(brand);
        this.setSeats(seats);
        this.setColor(color);
        this.setTyres(tyres);
        this.setHasWings(false);
        this.setVehicleType("Truck");
    }

    @Override
    public void createEngine() {
        System.out.println("Truck Engine Created");

    }

    @Override
    public void createExterior() {
        System.out.println("Truck Exterior Created");
    }

    @Override
    public void createInterior() {
        System.out.println("Truck Interior Created");
    }

}
