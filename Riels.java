public class Riels extends Currency {
    public Riels() {
        super(4000);
    }

    @Override
    public String getName() {
        return "RIELS";
    }

    public String exchangeToUSD(double amount) {
        double usdAmount = exchangeTo(new Dollar(), amount);
        return String.format("%.2f RIELS = %.2f USD", amount, usdAmount);
    }
}
