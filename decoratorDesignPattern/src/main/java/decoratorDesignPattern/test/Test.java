package decoratorDesignPattern.test;

import decoratorDesignPattern.pizza.BasePizza;
import decoratorDesignPattern.pizza.Marghereta;
import decoratorDesignPattern.pizza.TandooriPaneer;
import decoratorDesignPattern.toppings.ExtraCheese;
import decoratorDesignPattern.toppings.Mushroom;

public class Test {

	public static void main(String[] args) {
		
		BasePizza basePizza = new ExtraCheese(new TandooriPaneer());
		System.out.println(basePizza.getCost());
		
		BasePizza basePizza2 = new Mushroom(new ExtraCheese(new Marghereta()));
		System.out.println(basePizza2.getCost());
	}

}
