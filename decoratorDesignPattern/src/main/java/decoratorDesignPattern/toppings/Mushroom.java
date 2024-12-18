package decoratorDesignPattern.toppings;

import decoratorDesignPattern.pizza.BasePizza;

public class Mushroom extends BasePizza{
	
	private BasePizza basePizza;
	
	public Mushroom(BasePizza basePizza)
	{
		this.basePizza=basePizza;
	}

	@Override
	public int getCost() {
		return basePizza.getCost()+30;
	}
}
