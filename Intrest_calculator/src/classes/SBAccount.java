package classes;

class SBAccount extends Account {
    String type;

    SBAccount(double amount, String type) throws InvalidInputException {
        if (amount < 0)
            throw new InvalidInputException("Invalid Amount");

        this.amount = amount;
        this.type = type;

        if (type.equalsIgnoreCase("Normal"))
            interestRate = 4;
        else if (type.equalsIgnoreCase("NRI"))
            interestRate = 6;
        else
            throw new InvalidInputException("Invalid Account Type");
    }

    double calculateInterest() {
        return (amount * interestRate) / 100;
    }
}
