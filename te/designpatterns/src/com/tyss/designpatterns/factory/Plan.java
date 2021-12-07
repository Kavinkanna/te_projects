package com.tyss.designpatterns.factory;

public abstract class Plan {
	double rate;

	public abstract void setRate();

	public float generateBill(float units) {
		setRate();
		return (float) (units * rate);
	}
}
