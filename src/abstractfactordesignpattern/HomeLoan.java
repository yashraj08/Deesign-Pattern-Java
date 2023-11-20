package abstractfactordesignpattern;

import org.jetbrains.annotations.NotNull;

public class HomeLoan extends Loan{
    public HomeLoan(@NotNull Bank bank, double loanAmount, int years){
        super();
        setBank(bank);
        setLoanAmount(loanAmount);
        setYears(years);
        setInterestRate(bank.getHomeLoanInterestRate());
    }
}
