package abstractfactordesignpattern;

public class HDFCFactory extends BankFactory {


    @Override
    public Bank createBank() {
        return new HDFCBank();
    }

    @Override
    public Loan createLoan(Bank bank, double loanAmount, int years) {
        return null;
    }
}
