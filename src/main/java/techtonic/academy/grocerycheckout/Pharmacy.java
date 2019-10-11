package techtonic.academy.grocerycheckout;

import java.math.BigDecimal;

public class Pharmacy extends Item {
    boolean otc;
    boolean ageCheck;
    boolean rxCheck;

    public Pharmacy(BigDecimal price, long id, String name, String description, boolean otc, boolean ageCheck, boolean rxCheck) {
        super(price, id, name, description);
        this.otc = otc;
        this.ageCheck = ageCheck;
        this.rxCheck = rxCheck;
    }
}
