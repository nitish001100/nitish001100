import org.apache.spark.SparkConf
import org.apache.spark.api.java.{JavaRDD, JavaSparkContext}
import org.apache.spark.sql.SparkSession

object SparkRunner {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf()
      .setAppName("Test")
      .setMaster("local[*]");

    val sparkSession = SparkSession
      .builder()
      .config(sparkConf)
      .getOrCreate()


    val sc = sparkSession.sparkContext

    val jsc = JavaSparkContext.fromSparkContext(sc)

    val textFileRDD: JavaRDD[String] = jsc.textFile("")

  }
}

case class Employee(empId: Int, empName: String)
