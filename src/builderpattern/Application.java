package builderpattern;

import java.util.Scanner;

public class Application {
    public static void main(String [] args) throws Exception {

        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter the type of Pizza you want \n 1 for Onion \n 2 for Margerita Veg \n 3 for Margerita Non Veg \n 4 for Farmhouse Veg \n 5 for Farmhouse Non Veg\n");
        int pizzaChoice = sc.nextInt();
        System.out.println("Enter the choice of crust you want :\n 1 for CHEESEBURST \n 2 for THINCRUST \n 3 for HANDTOSSED \n ");
        int crustChoice = sc.nextInt();
        System.out.println("Enter the choice for size of the pizza you want :\n 1 for LARGE \n 2 for MEDIUM \n 3 for REGULAR \n ");
        int sizeChoice =sc.nextInt();
        System.out.println("Do you want Extra cheese : \n 1 for Yes \n 2 for No \n");
        boolean extraCheese = sc.nextInt() ==1;
        Crust crust= switch (crustChoice){
            case 1-> Crust.CHEESEBURST;
            case 2-> Crust.THINCRUST;
            case 3 ->Crust.HANDTOSSED;
            default -> throw new Exception("Inavlid choice of crust");
        };
        Size size= switch (sizeChoice){
            case 1-> Size.LARGE;
            case 2-> Size.MEDIUM;
            case 3 ->Size.REGULAR;
            default -> throw new Exception("Inavlid choice of size");
        };

        Pizza pizza = switch (pizzaChoice){
            case 1 -> Director.onionPizza(crust,size,extraCheese);
            case 2 -> Director.margeritaVeg(crust,size,extraCheese);
            case 3 -> Director.margeritaNonVeg(crust,size,extraCheese);
            case 4 -> Director.farmhouseVeg(crust,size,extraCheese);
            case 5 -> Director.farmhouseNonVeg(crust,size,extraCheese);
            default -> throw new Exception("Inavlid choice of Pizza");
        };
        System.out.println(pizza);

    }
}
