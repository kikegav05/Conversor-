import java.math.BigDecimal;
public class Rates {
    private BigDecimal USD = new BigDecimal(1.0);
    private BigDecimal EUR;
    private BigDecimal MXN;

    public BigDecimal getUSD() {
        return USD;
    }

    public void setUSD(BigDecimal uSD) {
        USD = uSD;
    }

    public BigDecimal getEUR() {
        return EUR;
    }

    public void setEUR(BigDecimal eUR) {
        EUR = eUR;
    }

    public BigDecimal getMXN() {
        return MXN;
    }

    public void setMXN(BigDecimal mXN) {
        MXN = mXN;
    }
}


