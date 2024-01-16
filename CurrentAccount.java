class CurrentAccount {
    String holder;
    int nMovements;
    final int maxMovements = 50;
    double balance;

    CurrentAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
        nMovements = 0;
    }

    void withdraw(double x) throws BancaException {
        if (nMovements < maxMovements) {
            balance = balance - x;
        } else {
            balance = balance - x - 0.50;
        }
        nMovements++;

        if (balance < 0) {
            throw new BancaException("The account is in red");
        }
    }

    double returnBalance() {
        return balance;
    }
}
