package abstractfactordesignpattern;

public class EducationLoanFactory extends LoanFactory{


    @Override
    public Bank createBank() {
        return null;
    }

    @Override
    public Loan createLoan(Bank bank, double loanAmount, int years) {
        return new EducationLoan(bank,loanAmount,years);
    }
}
