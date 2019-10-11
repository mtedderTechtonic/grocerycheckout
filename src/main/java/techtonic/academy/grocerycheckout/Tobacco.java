package techtonic.academy.grocerycheckout;

import java.math.BigDecimal;

public class Tobacco extends Item {
    static final BigDecimal tax = BigDecimal.valueOf(0.042);
    boolean ageCheck;

    public Tobacco(BigDecimal price, long id, String name, String description, boolean ageCheck) {
        super(price, id, name, description);
        this.ageCheck = ageCheck;
    }
}
