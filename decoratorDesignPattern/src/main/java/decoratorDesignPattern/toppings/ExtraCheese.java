package decoratorDesignPattern.toppings;

import decoratorDesignPattern.pizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator{
	
	private BasePizza basePizza;
	
	public ExtraCheese(BasePizza basePizza) {
		this.basePizza=basePizza;
	}

	@Override
	public int getCost() {
		return basePizza.getCost()+50;
	}
	
}
