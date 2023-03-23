public abstract class Currency {
    protected double exchangeRate;

    public Currency(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public abstract String getName();

    public double exchangeTo(Currency targetCurrency, double amount) {
        return amount / exchangeRate * targetCurrency.exchangeRate;
    }
}
