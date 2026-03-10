package classes;

class RDAccount extends Account {
    int noOfMonths;
    int age;
    double monthlyAmount;

    RDAccount(double monthlyAmount, int noOfMonths, int age) throws InvalidInputException {
        if (monthlyAmount < 0 || noOfMonths < 0 || age < 0)
            throw new InvalidInputException("Invalid Input");

        this.monthlyAmount = monthlyAmount;
        this.noOfMonths = noOfMonths;
        this.age = age;

        setInterestRate();
    }

    private void setInterestRate() throws InvalidInputException {
        boolean senior = age >= 60;

        switch (noOfMonths) {
            case 6:  interestRate = senior ? 8.00 : 7.50; break;
            case 9:  interestRate = senior ? 8.25 : 7.75; break;
            case 12: interestRate = senior ? 8.50 : 8.00; break;
            case 15: interestRate = senior ? 8.75 : 8.25; break;
            case 18: interestRate = senior ? 9.00 : 8.50; break;
            case 21: interestRate = senior ? 9.25 : 8.75; break;
            default:
                throw new InvalidInputException("Invalid Number of months");
        }
    }

    double calculateInterest() {
        double totalAmount = monthlyAmount * noOfMonths;
        return (totalAmount * interestRate) / 100;
    }
}