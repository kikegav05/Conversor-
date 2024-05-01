import java.math.BigDecimal;

public enum Divisas {
    USD(new BigDecimal(1)),
    EUR(new BigDecimal(0.95)),
    MXN(new BigDecimal(17.99));

    private BigDecimal usdValue;

    Divisas (BigDecimal usdValue){
        this.usdValue=usdValue;
    }

    public BigDecimal getUsdValue() {
        return usdValue;
    }

    public void setUsdValue(BigDecimal usdValue) {
        this.usdValue = usdValue;
    }


    public double compareTo() {
        return 0;
    }
}

