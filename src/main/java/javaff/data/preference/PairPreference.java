package javaff.data.preference;

import javaff.data.Literal;

class PairPreference extends Preference {
	Literal literal1, literal2;

	PairPreference(String name, Literal literal1, Literal literal2) {
		super(name);
		this.literal1 = literal1;
		this.literal2 = literal2;
	}

	@Override
	public String toString() {
		return "(" + getClass().getSimpleName() + " (" + literal1 + ") (" + literal2 + "))";
	}
}
