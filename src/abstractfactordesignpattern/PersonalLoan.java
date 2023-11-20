package abstractfactordesignpattern;

import org.jetbrains.annotations.NotNull;

public class PersonalLoan extends Loan{
    public PersonalLoan(@NotNull Bank bank, double loanAmount, int years){
        super();
        setBank(bank);
        setLoanAmount(loanAmount);
        setYears(years);
        setInterestRate(bank.getPersonalLoanInterestRates());
    }
}
