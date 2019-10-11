package techtonic.academy.grocerycheckout;

import java.math.BigDecimal;
import java.util.Date;

public class FoodBuilder {
    private BigDecimal price;
    private long id;
    private String name;
    private String description;
    private Date expDate;

    public FoodBuilder setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public FoodBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public FoodBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public FoodBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public FoodBuilder setExpDate(Date expDate) {
        this.expDate = expDate;
        return this;
    }

    public Food createFood() {
        return new Food(price, id, name, description, expDate);
    } // returns non-primitive
}