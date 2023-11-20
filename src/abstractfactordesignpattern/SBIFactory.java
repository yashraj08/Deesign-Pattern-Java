package abstractfactordesignpattern;

public class SBIFactory extends BankFactory{


    @Override
    public Bank createBank() {
        return new SBIBank();
    }

    @Override
    public Loan createLoan(Bank bank, double loanAmount, int years) {
        return null;
    }
}
