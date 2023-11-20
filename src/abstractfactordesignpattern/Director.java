package abstractfactordesignpattern;

public class Director {
    public static AbstractFactory getFactory(String choice,int typeChoice ) throws Exception {
        if(choice.equals("bank")){

            return switch (typeChoice) {
                case 1 -> new SBIFactory();
                case 2 -> new HDFCFactory();
                case 3 -> new ICICIFactory();
                default -> throw new Exception("Invalid Bank");
            };
        }
        else{

            return switch (typeChoice) {
                case 1 -> new HomeLoanFactory();
                case 2 -> new EducationLoanFactory();
                case 3 -> new PersonalLoanFactory();
                case 4 -> new BusinessLoanFactory();
                default -> throw new Exception("Invalid loan type");
            };
        }
    }
}
