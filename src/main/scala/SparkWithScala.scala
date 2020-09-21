import org.apache.spark.SparkContext
import org.apache.spark.api.java.JavaSparkContext
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.{DataType, StructType}

class SparkWithScala {
  def main(args: Array[String]): Unit = {
    val sparkSession = SparkSession
      .builder()
      .master("local[*]")
      .getOrCreate()

    val sc = sparkSession.sparkContext
    val jsc = JavaSparkContext.fromSparkContext(sc)
    val stringRDD = jsc.textFile("C:\\Users\\nitish.saxena\\Desktop\\datasets_810_1496_airports.csv")

    val structType = new StructType()

    val schemaList = List("", "", "", "", "", "", "")

  }
}
