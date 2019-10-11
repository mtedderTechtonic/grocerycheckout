package techtonic.academy.grocerycheckout;

import java.math.BigDecimal;
import java.util.Date;

public class Pantry extends Food {
    long upc;

    public Pantry(BigDecimal price, long id, String name, String description, Date expDate) {
        super(price, id, name, description, expDate);
        this.upc = upc;
    }
}
