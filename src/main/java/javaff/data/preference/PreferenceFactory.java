package javaff.data.preference;

import javaff.data.Literal;

public class PreferenceFactory {

	private PreferenceFactory() {

	}

	public static Preference atEnd(String name, Literal literal) {
		return new AtEnd(name, literal);
	}

	public static Preference always(String name, Literal literal) {
		return new Always(name, literal);
	}

	public static Preference sometime(String name, Literal literal) {
		return new Sometime(name, literal);
	}

	public static Preference within(String name, Literal literal, int num1) {
		return new Within(name, literal, num1);
	}

	public static Preference atMostOnce(String name, Literal literal) {
		return new AtMostOnce(name, literal);
	}

	public static Preference sometimeAfter(String name, Literal literal1, Literal literal2) {
		return new SometimeAfter(name, literal1, literal2);
	}

	public static Preference sometimeBefore(String name, Literal literal1, Literal literal2) {
		return new SometimeBefore(name, literal1, literal2);
	}

	public static Preference alwaysWithin(String name, Literal literal1, Literal literal2, int num1) {
		return new AlwaysWithin(name, literal1, literal2, num1);
	}

	public static Preference holdDuring(String name, Literal literal1, int num1, int num2) {
		return new HoldDuring(name, literal1, num1, num2);
	}

	public static Preference holdAfter(String name, Literal literal1, int  num1) {
		return new HoldAfter(name, literal1, num1);
	}
}
