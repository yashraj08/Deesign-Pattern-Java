package abstractfactordesignpattern;

public class ICICIFactory extends BankFactory{

    @Override
    public Bank createBank() {
        return new ICICIBank();
    }


}
