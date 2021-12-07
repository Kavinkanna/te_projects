package com.tyss.designpatterns.factory;

public class GetPlan {

	public Plan getPlan(String planType) {

		if (planType.equalsIgnoreCase("Domestic")) {
			return new Domestic();
		} else if (planType.equalsIgnoreCase("commercial")) {
			return new Commercial();
		} else if (planType.equalsIgnoreCase("institute")) {
			return new Institutional();
		}

		return null;
	}
}
