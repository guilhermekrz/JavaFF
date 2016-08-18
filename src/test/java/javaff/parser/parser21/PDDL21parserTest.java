package javaff.parser.parser21;

import javaff.data.UngroundProblem;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class PDDL21parserTest {

	@Test
	public void testBlocksworld() {
		UngroundProblem ungroundProblem = PDDL21parser.parseFiles(new File("pddl/blocksworld/domain.pddl"), new File("pddl/blocksworld/p01.pddl"));
		assertEquals(4, ungroundProblem.actions.size());
	}

	@Test
	public void testDepots() {
		UngroundProblem ungroundProblem = PDDL21parser.parseFiles(new File("pddl/depots/domain.pddl"), new File("pddl/depots/p01.pddl"));
		assertEquals(5, ungroundProblem.actions.size());
	}

}