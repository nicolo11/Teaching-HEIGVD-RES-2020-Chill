package ch.heigvd.res.chill.domain.WenesLimem;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Celtia implements IProduct {
    public final static  String NAME = "Celtia";
    public final static BigDecimal PRCIE = new BigDecimal(1.5);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRCIE;
    }
}
