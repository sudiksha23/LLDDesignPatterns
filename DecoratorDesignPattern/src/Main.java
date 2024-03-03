import DecoratorToppings.ExtraCheese;
import DecoratorToppings.Paneer;
import StandardPizzas.BasePizza;
import StandardPizzas.FarmhousePizza;
import StandardPizzas.VegDelightPizza;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1=new FarmhousePizza();
        System.out.println("Cost of farmhouse pizza is: "+pizza1.cost());

        BasePizza pizza2 = new ExtraCheese(new FarmhousePizza());
        System.out.println("Cost of farmhousePizza with extracheese is: "+pizza2.cost());

        BasePizza pizza3 = new ExtraCheese(new Paneer(new VegDelightPizza()));
        System.out.println("Cost of vegDelight pizza with extra cheese and extra paneer is: "+pizza3.cost());
    }
}