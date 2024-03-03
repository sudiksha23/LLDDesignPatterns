package DecoratorToppings;

import StandardPizzas.BasePizza;

public class Paneer extends Toppings{
    BasePizza basePizza;
    public Paneer(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+25;
    }
}
