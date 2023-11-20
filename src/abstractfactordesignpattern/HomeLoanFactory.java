package abstractfactordesignpattern;

public class HomeLoanFactory extends LoanFactory{


    @Override
    public Bank createBank() {
        return null;
    }

    @Override
    public Loan createLoan(Bank bank, double loanAmount, int years) {
        return new HomeLoan(bank,loanAmount,years);
    }
}
