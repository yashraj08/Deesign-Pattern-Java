package abstractfactordesignpattern;

public class HDFCFactory extends BankFactory {


    @Override
    public Bank createBank() {
        return new HDFCBank();
    }


}
