package decorator;

public class Olive implements Pizza {
    private Pizza pizza;

    public Olive() {}

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if (pizza != null) {
            return pizza.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if (pizza != null) {
            return pizza.getDescription() + " + Olive";
        }
        return "Olive";
    }
}
