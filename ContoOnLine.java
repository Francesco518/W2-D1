class ContoOnLine extends CurrentAccount {
    double maxWithdrawal;

    ContoOnLine(String holder, double balance, double maxP) {
        super(holder, balance);
        this.maxWithdrawal = maxP;
    }

    void printBalance() {
        System.out.println("Owner:" + holder + " - Balance:" + balance + " - Num movements:" + nMovements
                + " - Maximum movements:" + maxMovements + " - Maximum possible withdrawal:" + maxWithdrawal);
    }

    @Override
    void withdraw(double x) throws BancaException {
        if (x > maxWithdrawal) {
            throw new BancaException("The withdrawal is not available");
        }
        super.withdraw(x);
    }
}
