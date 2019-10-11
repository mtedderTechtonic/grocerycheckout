package techtonic.academy.grocerycheckout;
import java.math.BigDecimal;

public class Item {
    BigDecimal price;
    long id;
    String name;
    String description;

    public Item(BigDecimal price, long id, String name, String description) {
        this.price = price;
        this.id = id;
        this.name = name;
        this.description = description;
    }
}


