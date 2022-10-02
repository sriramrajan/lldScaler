package decorator;

public class Margarita implements Pizza {
    private Pizza pizza;

    public Margarita() {}

    public Margarita(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if (pizza != null) {
            return pizza.getCost() + 200;
        }
        return 200;
    }

    @Override
    public String getDescription() {
        if (pizza != null) {
            return pizza.getDescription() + " Margarita";
        }
        return "Margarita";
    }
}
