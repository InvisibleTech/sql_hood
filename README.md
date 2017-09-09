# sql_hood
Project used to explore Spark SQL.
## Overview
This is a Spark project based on Scala using Maven.  Why Maven?  Because I do not want to burn time
right now.  Most of the work done in this project is meant to follow along with the samles created in in the 
[Spark SQL Blog Articles](http://virtuslab.com/blog/spark-sql-hood-part-i/) which exaplain Spark SQL by 
examples and iclude the RDDs as part of the explanation.
## How I created the project
    mvn archetype:generate -Dfilter=scala-archetype-simpl
I picked number 1 in the list.


## Disclaimers
The shaded jar produced by this example is a bit of a hot mess, I did not do the whole filter colliding jars
thing because for me this is meant to help me learn and I suppose others could use it as a starting point.

