package abstractfactordesignpattern;

import org.jetbrains.annotations.NotNull;

public class BusinessLoan extends Loan{
    public BusinessLoan(@NotNull Bank bank, double loanAmount, int years){
        super();
        setBank(bank);
        setLoanAmount(loanAmount);
        setYears(years);
        setInterestRate(bank.getBusinessLoanInterestRates());
    }
}
