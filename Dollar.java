public class Dollar extends Currency {
    public Dollar() {
        super(1 / 4000.0); // reciprocal of 1 USD = 4000 RIELS
    }

    @Override
    public String getName() {
        return "USD";
    }
}
