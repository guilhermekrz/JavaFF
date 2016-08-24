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

public class AlwaysWithin implements GroundFact, UngroundFact {

	private int num;
	private Fact fact1, fact2;

	public AlwaysWithin(int num, Fact fact1, Fact fact2) {
		this.num = num;
		this.fact1 = fact1;
		this.fact2 = fact2;
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
		return "always-within " + num + " (" + fact1.toStringTyped() + ") (" + fact2.toStringTyped() + ")";
	}

	@Override
	public String toString() {
		return "always-within " + num + " (" + fact1 + ") (" + fact2 + ")";
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
