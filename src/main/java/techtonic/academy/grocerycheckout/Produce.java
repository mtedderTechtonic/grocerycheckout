package techtonic.academy.grocerycheckout;
import java.math.BigDecimal;
import java.util.Date;

public class Produce extends Food{
    int plu;
    boolean packaged;
    double weight;

    public Produce(BigDecimal price, long id, String name, String description, Date expDate) {
        super(price, id, name, description, expDate);
        this.plu = plu;
        this.packaged = packaged;
        this.weight = weight;
    }
}
