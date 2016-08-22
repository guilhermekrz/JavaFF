package javaff.data.preference;

import javaff.data.Literal;

class HoldAfter extends SinglePreference {
	private int num;

	HoldAfter(String name, Literal literal, int num) {
		super(name, literal);
		this.num = num;
	}

	@Override
	public String toString() {
		return "(" + getClass().getSimpleName() + " (" + num + ") (" + literal + "))";
	}
}
