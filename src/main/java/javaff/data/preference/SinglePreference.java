package javaff.data.preference;

import javaff.data.Literal;

class SinglePreference extends Preference {

	protected Literal literal;

	SinglePreference(String name, Literal literal) {
		super(name);
		this.literal = literal;
	}

	@Override
	public String toString() {
		return "(" + getClass().getSimpleName() + " " + literal + ")";
	}
}
