package abstractfactordesignpattern;

public class PersonalLoanFactory extends LoanFactory{


    @Override
    public Bank createBank() {
        return null;
    }

    @Override
    public Loan createLoan(Bank bank, double loanAmount, int years) {
        return new PersonalLoan(bank,loanAmount,years);
    }
}
