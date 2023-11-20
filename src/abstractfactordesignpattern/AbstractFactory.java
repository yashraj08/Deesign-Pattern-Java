package abstractfactordesignpattern;

 interface AbstractFactory {


     Bank createBank();
     Loan createLoan(Bank bank, double loanAmount, int years);
 }
