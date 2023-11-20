package abstractfactordesignpattern;

import org.jetbrains.annotations.NotNull;

public class HomeLoan extends Loan{
    public HomeLoan(@NotNull Bank bank, double loanAmount, int years){
        super();
        setLoanAmount(loanAmount);
        setYears(years);
        setInterestRate(bank.getHomeLoanInterestRate());
    }
}
