class Bank {
    public void printTypeOfLoan(Loan loan) {
        System.out.println(loan.loanType());
    }
}

abstract class Loan {
    abstract String loanType();
}

class EducationLoan extends Loan {
    @Override
    String loanType() {
        return "Education loan granted!";
    }
}

class HouseLoan extends Loan {
    @Override
    String loanType() {
        return "Housing loan granted!";
    }
}

public class MainClass {
    public static void main(String[] args) {
        Bank bank = new Bank();

        EducationLoan educationLoan = new EducationLoan();
        HouseLoan houseLoan = new HouseLoan();

        bank.printTypeOfLoan(educationLoan);
        bank.printTypeOfLoan(houseLoan);
    }
}
