package org.sparkle

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD
import org.apache.spark

object CoreAbstractionsRDD {
  def run(sc: SparkContext): Unit = {
    val rdd: RDD[Int] = sc.parallelize(Seq(1, 2, 3))

    println(s"Dependencies\n\t ${rdd.dependencies}")
    println(s"Debug String\n\t ${rdd.toDebugString}")

    val rdd2: RDD[String] = rdd.map(_.toString)

    println(s"Dependencies\n\t ${rdd2.dependencies}")
    println(s"Debug String\n\t ${rdd2.toDebugString}")
  }
}
