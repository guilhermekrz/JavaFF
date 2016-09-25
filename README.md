# JavaFF [![Build Status](https://travis-ci.org/guilhermekrz/JavaFF.svg?branch=master)](https://travis-ci.org/guilhermekrz/JavaFF)

Initial commit from: http://www.inf.kcl.ac.uk/staff/andrew/JavaFF/ - version 1.0.1

However, from commit [c6b5ce](https://github.com/guilhermekrz/JavaFF/commit/c6b5ce5b796a0cda71dcbd2d21d83ac18e5db671) onwards, we are using an old ~~obscure~~ code, because it supports more requirements (e.g. "negative-preconditions"). 

TODO: Try to find the source of this commit.

JavaFF is released under the [GNU GPL](http://www.gnu.org/licenses/gpl.html).

# Parser

Added some extensions from PDDL 3.0, namely :constraints and :preference. 

Note that the Planner does NOT work with PDDL 3.0. 

The purpose of extending JavaFF project was to take advantage of its nice Parser.

Added "PDDLParser" class to interface between Parser 2.1 and Parser 3.0.

## Parser 2.1 - Supported requirements

### Supported requirements

":typing" | ":strips" | ":equality" | ":fluents" | ":durative-actions" | ":duration-inequalities" | ":numeric-fluents" | ":action-costs" | ":adl" | ":negative-preconditions" | ":disjunctive-preconditions"  | ":existential-preconditions" | "universal-preconditions" | "quantified-preconditions" | ":conditional-effects"  | ":timed-initial-literals"

### Non-supported requirements

":domain-axioms" | ":derived-predicates" | ":preferences" | ":constraints"
":action-expansions" | ":foreach-expansions" | ":dag-expansions" | ":subgoal-through-axioms" | ":safety-constraints" | ":expression-evaluation" | ":open-world" | ":true-negation" | ":ucpop"

## Parser 3.0

Changes from Parser 2.1: Added support for ":preferences" | ":constraints" requirements.

### Supported requirements

":typing" | ":strips" | ":equality" | ":fluents" | ":durative-actions" | ":duration-inequalities" | ":numeric-fluents" | ":action-costs" | ":adl" | ":negative-preconditions" | ":disjunctive-preconditions"  | ":existential-preconditions" | "universal-preconditions" | "quantified-preconditions" | ":conditional-effects"  | ":timed-initial-literals" | ":preferences" | ":constraints"

### Non-supported requirements

":domain-axioms" | ":derived-predicates"
":action-expansions" | ":foreach-expansions" | ":dag-expansions" | ":subgoal-through-axioms" | ":safety-constraints" | ":expression-evaluation" | ":open-world" | ":true-negation" | ":ucpop"

# Planner

Continue to use PDDL 2.1.

To run JavaFF, expand the archive, set the CLASSPATH environment variable to point to the directory in which it was expanded, then type:

```java javaff.JavaFF domain.pddl problem.pddl```


To allocate more memory, beyond Java's default, you may wish to type:

```java -Xmx1024m javaff.JavaFF domain.pddl problem.pddl```
