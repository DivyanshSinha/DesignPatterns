package abstractDesignPattern.speaker.impl;

import abstractDesignPattern.components.api.Speaker;

public class TowerSpeaker implements Speaker{

	@Override
	public void build() {
		System.out.println("This is a tower speaker");
	}
	
}
