package decorator;

public class Tomato implements Pizza {
    private Pizza pizza;

    public Tomato() {}

    public Tomato(Pizza pizza) {
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
            return pizza.getDescription() + " + Tomato";
        }
        return "Tomato";
    }
}
