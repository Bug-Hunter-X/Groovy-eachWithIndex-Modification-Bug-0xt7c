This repository demonstrates a common issue in Groovy when modifying a collection while iterating using `eachWithIndex`.  The example shows how removing an element during iteration can disrupt the index and lead to elements being skipped.

The `bug.groovy` file contains the erroneous code, while `bugSolution.groovy` provides a corrected version using an iterator or creating a new list.