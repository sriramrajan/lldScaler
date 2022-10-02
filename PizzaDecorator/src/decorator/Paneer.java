package decorator;

public class Paneer implements Pizza {
    private Pizza pizza;

    public Paneer() {}

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if (pizza != null) {
            return pizza.getCost() + 60;
        }
        return 60;
    }

    @Override
    public String getDescription() {
        if (pizza != null) {
            return pizza.getDescription() + " + Paneer";
        }
        return "Paneer";
    }
}
