package factorydesignpattern;

abstract class Vehicle {
    private String brand ;
    private int seats;
    private  int tyres;
    private String color;

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    private String VehicleType;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    private boolean hasWings;

    public abstract void createEngine();
    public abstract void createInterior();
    public abstract void createExterior();
    public void display(){

        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", seats=" + seats +
                ", tyres=" + tyres +
                ", color='" + color + '\'' +
                ", VehicleType='" + VehicleType + '\'' +
                ", hasWings=" + hasWings +
                '}';
    }
}
