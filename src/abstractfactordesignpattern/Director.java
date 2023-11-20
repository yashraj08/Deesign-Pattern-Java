package abstractfactordesignpattern;

public class Director {
    public static AbstractFactory getFactory(String choice,String typeChoice ) throws Exception {
        if(choice.equals("bank")){

            switch(typeChoice.toUpperCase()){
                case "SBI": return new SBIFactory();
                case "HDFC": return new HDFCFactory();
                case "ICICI": return new ICICIFactory();
                default: throw new Exception("Invalid Bank");

            }
        }
        else{

            switch (typeChoice.toLowerCase()) {
                case "home":
                    return new HomeLoanFactory();

                case "education":
                    return new EducationLoanFactory();

                case "personal":
                    return new PersonalLoanFactory();

                case "business": return new BusinessLoanFactory();
                default: throw new Exception("Invalid loan type");


            }
        }
    }
}
