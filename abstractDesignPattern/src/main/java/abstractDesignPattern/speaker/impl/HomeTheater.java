package abstractDesignPattern.speaker.impl;

import abstractDesignPattern.components.api.Speaker;

public class HomeTheater implements Speaker{

	@Override
	public void build() {
		System.out.println("This is a home theater speaker");
	}

}
