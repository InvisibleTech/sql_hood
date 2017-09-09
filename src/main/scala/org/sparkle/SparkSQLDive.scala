package org.sparkle

import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.Dataset

case class Person(name: String, age: Option[Long])

object SparkSQLDive {
  def run(sc: SparkContext, ss: SparkSession): Unit = {
    import ss.implicits._

    val peopleDataset: Dataset[Person] =
      ss
      .read
      .json("src/main/resources/people.json").as[Person]

    peopleDataset.cache()
    val eldersDataset: Dataset[Person] = peopleDataset.filter(_.age.exists(_ > 65))
    eldersDataset.write.save(s"results/generated/people_filtered_${System.currentTimeMillis()}")
  }
}
