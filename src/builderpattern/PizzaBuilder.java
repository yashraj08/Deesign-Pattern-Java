package builderpattern;

public class PizzaBuilder {

    private final Pizza pizza;
    public PizzaBuilder(Crust crust, Size size){
        pizza=new Pizza();
        pizza.setCrust(crust);
        pizza.setSize(size);
    }
    public Pizza builder(){
        return this.pizza;
    }
    public PizzaBuilder addExtraCheese(boolean choice){
       this.pizza.setExtraCheese(choice);
       return this;
    }
    public PizzaBuilder addToppings(Topping topping){
        pizza.addTopping(topping);
        return this;
    }
    public PizzaBuilder isVeg(boolean veg){
        pizza.setVeg(veg);
        return this;
    }
}
