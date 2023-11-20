package factorydesignpattern;

public class Car extends Vehicle {
   public Car(String brand , int seats , int tyres, String color ){
       super();
       this.setBrand(brand);
       this.setSeats(seats);
       this.setColor(color);
       this.setTyres(tyres);
       this.setHasWings(false);
       this.setVehicleType("Car");
   }


    @Override
    public void createEngine() {
        System.out.println("Car Engine Created");

    }

    @Override
    public void createExterior() {
        System.out.println("Car Exterior Created");
    }

    @Override
    public void createInterior() {
        System.out.println("Car Interior Created");
    }
}
