package com.tyss.designpattern.template;

public class PUBG extends Game {

	@Override
	public void init() {
		System.out.println(" Started Initializating Pubg");

	}

	@Override
	public void start() {
		System.out.println("Welcome to Battle Ground");

	}

	@Override
	public void end() {
		System.out.println(" Game ended , Pubg");
	}

}
