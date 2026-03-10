package classes;

class FDAccount extends Account {
    int noOfDays;
    int age;

    FDAccount(double amount, int noOfDays, int age) throws InvalidInputException {
        if (amount < 0 || noOfDays < 0 || age < 0)
            throw new InvalidInputException("Invalid Input");

        this.amount = amount;
        this.noOfDays = noOfDays;
        this.age = age;

        setInterestRate();
    }

    private void setInterestRate() throws InvalidInputException {
        boolean senior = age >= 60;

        if (amount < 10000000) {
            if (noOfDays >= 7 && noOfDays <= 14)
                interestRate = senior ? 5.00 : 4.50;
            else if (noOfDays <= 29)
                interestRate = senior ? 5.25 : 4.75;
            else if (noOfDays <= 45)
                interestRate = senior ? 6.00 : 5.50;
            else if (noOfDays <= 60)
                interestRate = senior ? 7.50 : 7.00;
            else if (noOfDays <= 184)
                interestRate = senior ? 8.00 : 7.50;
            else if (noOfDays <= 365)
                interestRate = senior ? 8.50 : 8.00;
            else
                throw new InvalidInputException("Invalid Number of days");
        } else { 
            if (noOfDays >= 7 && noOfDays <= 14)
                interestRate = 6.50;
            else if (noOfDays <= 29)
                interestRate = 6.75;
            else if (noOfDays <= 45)
                interestRate = 6.75;
            else if (noOfDays <= 60)
                interestRate = 8.00;
            else if (noOfDays <= 184)
                interestRate = 8.50;
            else if (noOfDays <= 365)
                interestRate = 10.00;
            else
                throw new InvalidInputException("Invalid Number of days");
        }
    }

    double calculateInterest() {
        return (amount * interestRate) / 100;
    }
}
