package org.sparkle

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object App {
  def main(args : Array[String]) {
    println("Running SparkSQL Internals" )
    println("Using arguments " + args)

    val conf = new SparkConf().setAppName("SparkSQL Internals").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val ss = SparkSession.builder.config(conf).getOrCreate()

    SparkSQLDive.run(sc, ss)
  }

}
