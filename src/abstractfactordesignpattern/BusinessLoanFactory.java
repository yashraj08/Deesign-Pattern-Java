package abstractfactordesignpattern;

public class BusinessLoanFactory extends LoanFactory{


    @Override
    public Bank createBank() {
        return null;
    }

    @Override
    public Loan createLoan(Bank bank, double loanAmount, int years) {
        return new BusinessLoan(bank,loanAmount,years);
    }
}
