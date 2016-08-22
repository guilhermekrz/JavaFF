package javaff.data.preference;

import javaff.data.Literal;

class HoldDuring extends SinglePreference {
	private int num1, num2;

	HoldDuring(String name, Literal literal, int num1, int num2) {
		super(name, literal);
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "(" + getClass().getSimpleName() + " (" + num1 + ") ("  + " (" + num2 + ") (" + literal + "))";
	}
}
