package javaff.data.preference;

import javaff.data.Literal;

class AlwaysWithin extends PairPreference {

	private int num;

	AlwaysWithin(String name, Literal literal1, Literal literal2, int num) {
		super(name, literal1, literal2);
		this.num = num;
	}

	@Override
	public String toString() {
		return "(" + getClass().getSimpleName() + " (" + num + ") (" + literal1 + ") (" + literal2 + "))";
	}
}
