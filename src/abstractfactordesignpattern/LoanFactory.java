package abstractfactordesignpattern;

abstract class LoanFactory implements AbstractFactory{


    public abstract Loan  createLoan(Bank bank, double loanAmount, int years);

}
