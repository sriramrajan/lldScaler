package decorator;

public class Cheese implements Pizza {
    private Pizza pizza;

    public Cheese() {}

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if (pizza != null) {
            return pizza.getCost() + 80;
        }
        return 80;
    }

    @Override
    public String getDescription() {
        if (pizza != null) {
            return pizza.getDescription() + " + Cheese";
        }
        return "Cheese";
    }
}
