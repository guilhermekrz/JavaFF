package javaff.parser;

import javaff.data.GroundProblem;
import javaff.data.UngroundProblem;
import javaff.parser.parser21.PDDL21parser;
import javaff.parser.parser30.PDDL30parser;

import java.io.File;

public class PDDLParser {

	private PDDLParser() {

	}

	/**
	 * Parser 2.1
	 */

	public static UngroundProblem getUngroundDomainProblem21(String domainFilePath, String problemFilePath) {
		File domainFile = new File(domainFilePath);
		File problemFile = new File(problemFilePath);
		return PDDL21parser.parseFiles(domainFile, problemFile);
	}

	public static GroundProblem getGroundDomainProblem21(String domainFilePath, String problemFilePath) {
		UngroundProblem ungroundProblem = getUngroundDomainProblem21(domainFilePath, problemFilePath);
		GroundProblem ground = ungroundProblem.ground();
		ground.setDomainPath(domainFilePath);
		ground.setProblemPath(problemFilePath);
		return ground;
	}

	/**
	 * Parser 3.0
	 */

	public static UngroundProblem getUngroundDomainProblem30(String domainFilePath, String problemFilePath) {
		File domainFile = new File(domainFilePath);
		File problemFile = new File(problemFilePath);
		return PDDL30parser.parseFiles(domainFile, problemFile);
	}

	public static GroundProblem getGroundDomainProblem30(String domainFilePath, String problemFilePath) {
		UngroundProblem ungroundProblem = getUngroundDomainProblem30(domainFilePath, problemFilePath);
		GroundProblem ground = ungroundProblem.ground();
		ground.setDomainPath(domainFilePath);
		ground.setProblemPath(problemFilePath);
		return ground;
	}

}
