package javaff.parser.parser30;

import javaff.data.UngroundProblem;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class PDDL30parserTest {

	@Test
	public void testBlocksworld() {
		UngroundProblem ungroundProblem = PDDL30parser.parseFiles(new File("pddl/blocksworld/domain.pddl"), new File("pddl/blocksworld/p01.pddl"));
		assertEquals(4, ungroundProblem.actions.size());
	}

	@Test
	public void testDepots() {
		UngroundProblem ungroundProblem = PDDL30parser.parseFiles(new File("pddl/depots/domain.pddl"), new File("pddl/depots/p01.pddl"));
		assertEquals(5, ungroundProblem.actions.size());
	}

	@Test
	public void testRovers1() {
		UngroundProblem ungroundProblem = PDDL30parser.parseFiles(new File("pddl/pddl30/rovers/QualitativePreferences/domain.pddl"), new File("pddl/pddl30/rovers/QualitativePreferences/p01.pddl"));
		assertEquals(9, ungroundProblem.actions.size());
	}

	@Test
	public void testRovers2() {
		UngroundProblem ungroundProblem = PDDL30parser.parseFiles(new File("pddl/pddl30/rovers/QualitativePreferences/domain.pddl"), new File("pddl/pddl30/rovers/QualitativePreferences/p02.pddl"));
		assertEquals(9, ungroundProblem.actions.size());
	}

}