package javaff.data.preference;

import javaff.data.Fact;
import javaff.data.GroundFact;
import javaff.data.UngroundFact;
import javaff.data.metric.NamedFunction;
import javaff.data.strips.PDDLObject;
import javaff.data.strips.PredicateSymbol;
import javaff.data.strips.Variable;
import javaff.planning.State;

import java.io.PrintStream;
import java.util.Map;
import java.util.Set;

public class HoldDuring implements GroundFact, UngroundFact {

	private int num1, num2;
	private Fact fact;

	public HoldDuring(int num1, int num2, Fact fact) {
		this.num1 = num1;
		this.num2 = num2;
		this.fact = fact;
	}

	@Override
	public boolean isStatic() {
		return false;
	}

	@Override
	public void setStatic(boolean value) {

	}

	@Override
	public void PDDLPrint(PrintStream p, int indent) {
		p.print(toString());
	}

	@Override
	public String toStringTyped() {
		return "hold-during " + num1 + " " + num2 + " (" + fact.toStringTyped() + ")";
	}

	@Override
	public String toString() {
		return "hold-during " + num1 + " " + num2 + " (" + fact + "";
	}

	@Override
	public boolean isTrue(State s) {
		return false;
	}

	@Override
	public Set<Fact> getFacts() {
		return null;
	}

	@Override
	public Set<NamedFunction> getComparators() {
		return null;
	}

	@Override
	public GroundFact staticify() {
		return null;
	}

	@Override
	public Object clone() {
		return null;
	}

	@Override
	public void apply(State s) {

	}

	@Override
	public void applyAdds(State s) {

	}

	@Override
	public void applyDels(State s) {

	}

	@Override
	public Set getOperators() {
		return null;
	}

	@Override
	public GroundFact ground(Map<Variable, PDDLObject> varMap) {
		return null;
	}

	@Override
	public Set<Fact> getStaticPredicates() {
		return null;
	}

	@Override
	public UngroundFact minus(UngroundFact effect) {
		return null;
	}

	@Override
	public boolean effects(PredicateSymbol ps) {
		return false;
	}

	@Override
	public UngroundFact effectsAdd(UngroundFact cond) {
		return null;
	}

	@Override
	public int compareTo(Fact fact) {
		return 0;
	}
}
