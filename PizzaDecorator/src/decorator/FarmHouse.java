package decorator;

public class FarmHouse implements Pizza {
    private Pizza pizza;

    public FarmHouse() {}

    public FarmHouse(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if (pizza != null) {
            return pizza.getCost() + 150;
        }
        return 150;
    }

    @Override
    public String getDescription() {
        if (pizza != null) {
            return pizza.getDescription() + " FarmHouse";
        }
        return "FarmHouse";
    }
}
