package abstractfactordesignpattern;

public class ICICIFactory extends BankFactory{

    @Override
    public Bank createBank() {
        return new ICICIBank();
    }

    @Override
    public Loan createLoan(Bank bank, double loanAmount, int years) {
        return null;
    }
}
