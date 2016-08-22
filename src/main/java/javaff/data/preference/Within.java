package javaff.data.preference;

import javaff.data.Literal;

class Within extends SinglePreference {
	private int num;

	Within(String name, Literal literal, int num) {
		super(name, literal);
		this.num = num;
	}

	@Override
	public String toString() {
		return "(" + getClass().getSimpleName() + " (" + num + ") (" + literal + "))";
	}
}
