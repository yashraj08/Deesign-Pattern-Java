package abstractfactordesignpattern;

public class Director {
    public static AbstractFactory getFactory(int bankChoice,int loanType ) throws Exception {
             AbstractFactory abstractFactory= new AbstractFactory();

            abstractFactory.bankFactory= switch (bankChoice) {
                case 1 -> new SBIFactory();
                case 2 -> new HDFCFactory();
                case 3 -> new ICICIFactory();
                default -> throw new Exception("Invalid Bank");
            };



            abstractFactory.loanFactory= switch (loanType) {
                case 1 -> new HomeLoanFactory();
                case 2 -> new EducationLoanFactory();
                case 3 -> new PersonalLoanFactory();
                case 4 -> new BusinessLoanFactory();
                default -> throw new Exception("Invalid loan type");
            };
            return abstractFactory;

    }
}
