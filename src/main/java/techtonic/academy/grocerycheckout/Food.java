package techtonic.academy.grocerycheckout;
import java.math.BigDecimal;
import java.util.Date;

public class Food extends Item {
    Date expDate;

    public Food(BigDecimal price, long id, String name, String description, Date expDate) {
        super(price, id, name, description);
        this.expDate = expDate;
    }
}
