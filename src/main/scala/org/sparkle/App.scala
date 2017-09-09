package org.sparkle

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

/**
 * @author ${user.name}
 */
object App {

  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))

    val conf = new SparkConf().setAppName("SparkSQL internals").setMaster("local[*]")
    val session = SparkSession.builder.config(conf).getOrCreate()
    import session.implicits._
  }

}
