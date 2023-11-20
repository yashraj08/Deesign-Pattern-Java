package abstractfactordesignpattern;

import org.jetbrains.annotations.NotNull;

public class EducationLoan extends Loan{
    public EducationLoan(@NotNull Bank bank, double loanAmount, int years){
        super();
        setLoanAmount(loanAmount);
        setYears(years);
        setInterestRate(bank.getEducationLoanInterestRate());
    }
}
