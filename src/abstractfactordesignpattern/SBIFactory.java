package abstractfactordesignpattern;

public class SBIFactory extends BankFactory{


    @Override
    public Bank createBank() {
        return new SBIBank();
    }


}
