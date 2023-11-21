package builderpattern;

public class Director {
    public static Pizza onionPizza(Crust crust,Size size,boolean extraCheese){
        return new PizzaBuilder(crust,size).addExtraCheese(extraCheese).isVeg(true).addToppings(Topping.ONION).addToppings(Topping.PEPPERONI).addToppings(Topping.MOZZARELLA).builder();
    }
    public static Pizza margeritaVeg(Crust crust,Size size,boolean extraCheese){
        return new PizzaBuilder(crust,size).addExtraCheese(extraCheese).isVeg(true).addToppings(Topping.MUSHROOM).addToppings(Topping.PEPPERONI).addToppings(Topping.MOZZARELLA).addToppings(Topping.CAPSICUM).builder();
    }
    public static Pizza farmhouseVeg(Crust crust,Size size,boolean extraCheese){
        return new PizzaBuilder(crust,size).addExtraCheese(extraCheese).isVeg(true).addToppings(Topping.MUSHROOM).addToppings(Topping.PEPPERONI).addToppings(Topping.ONION).addToppings(Topping.MOZZARELLA).addToppings(Topping.PANEER).addToppings(Topping.CAPSICUM).builder();
    }
    public static Pizza margeritaNonVeg(Crust crust,Size size,boolean extraCheese){
        return new PizzaBuilder(crust,size).addExtraCheese(extraCheese).isVeg(false).addToppings(Topping.BACON).addToppings(Topping.PEPPERONI).addToppings(Topping.MOZZARELLA).addToppings(Topping.SAUSAGE).builder();
    }
    public static Pizza farmhouseNonVeg(Crust crust,Size size,boolean extraCheese){
        return new PizzaBuilder(crust,size).addExtraCheese(extraCheese).isVeg(false).addToppings(Topping.BACON).addToppings(Topping.PEPPERONI).addToppings(Topping.ONION).addToppings(Topping.MOZZARELLA).addToppings(Topping.SAUSAGE).addToppings(Topping.CAPSICUM).builder();
    }
}
