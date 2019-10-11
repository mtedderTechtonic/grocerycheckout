package techtonic.academy.grocerycheckout;

public class Main {
    public static void main(String[] args) {
        Food food = new FoodBuilder()
                .setDescription("edible, delicious")
                .setName("burrito")
                .createFood();
    }
}
