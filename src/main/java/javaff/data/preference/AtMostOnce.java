package javaff.data.preference;

import javaff.data.Literal;

class AtMostOnce extends SinglePreference {
	AtMostOnce(String name, Literal literal) {
		super(name, literal);
	}
}
