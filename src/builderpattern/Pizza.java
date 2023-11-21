package builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public Pizza(){
        toppings = new ArrayList<>();
    }
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    private Size size;
    private Crust crust;
   private boolean Veg;
   private List<Topping> toppings;
   private boolean extraCheese;

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public boolean isVeg() {
        return Veg;
    }

    public void setVeg(boolean veg) {
        Veg = veg;
    }

    public List<Topping> getToppings() {
        return new ArrayList<>(toppings) ;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", crust=" + crust +
                ", Veg=" + Veg +
                ", toppings=" + toppings +
                ", extraCheese=" + extraCheese +
                '}';
    }
}
