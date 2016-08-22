# JavaFF

Initial commit from: http://www.inf.kcl.ac.uk/staff/andrew/JavaFF/ - version 1.0.1

JavaFF is released under the [GNU GPL](http://www.gnu.org/licenses/gpl.html).

# Parser

Added some extensions from PDDL 3.0, namely :constraints and :preference. 
Note that the Planner does NOT work with PDDL 3.0. 
The purpose of extending JavaFF project was to take advantage of its Parser.

# Planner

Continue to use PDDL 2.1.

To run JavaFF, expand the archive, set the CLASSPATH environment variable to point to the directory in which it was expanded, then type:

```java javaff.JavaFF domain.pddl problem.pddl```


To allocate more memory, beyond Java's default, you may wish to type:

```java -Xmx1024m javaff.JavaFF domain.pddl problem.pddl```
