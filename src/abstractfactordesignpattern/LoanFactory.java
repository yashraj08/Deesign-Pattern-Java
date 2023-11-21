package abstractfactordesignpattern;

abstract class LoanFactory  {


    public abstract Loan  createLoan(Bank bank, double loanAmount, int years);

}
