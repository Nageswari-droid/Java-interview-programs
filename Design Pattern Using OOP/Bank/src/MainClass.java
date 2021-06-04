class Bank {
    public void displayRateOfInterest(Loan loan) {
        System.out.println(loan.nameOfLoan + " rate of interest is " + loan.rateOfInterest + "%");
    }
}

abstract class Loan {
    String nameOfLoan = null;
    int rateOfInterest;
}

class EducationLoan extends Loan {
    EducationLoan(String loanType, int rateOfInterest) {
        this.nameOfLoan = loanType;
        this.rateOfInterest = rateOfInterest;
    }
}

class HousingLoan extends Loan {
    HousingLoan(String loanType, int rateOfInterest) {
        this.nameOfLoan = loanType;
        this.rateOfInterest = rateOfInterest;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Bank bank = new Bank();

        EducationLoan educationLoan = new EducationLoan("Education loan", 4);
        HousingLoan housingLoan = new HousingLoan("Housing loan", 5);

        bank.displayRateOfInterest(educationLoan);
        bank.displayRateOfInterest(housingLoan);
    }
}
