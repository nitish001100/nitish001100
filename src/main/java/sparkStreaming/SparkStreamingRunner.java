package sparkStreaming;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

public class SparkStreamingRunner {
    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf()
                .setMaster("local[*]")
                .setAppName("Stream");

        SparkSession sparkSession = SparkSession.builder()
                .config(sparkConf)
                .getOrCreate();

        SparkContext sc = sparkSession.sparkContext();

        JavaSparkContext jsc = JavaSparkContext.fromSparkContext(sc);

        JavaRDD<String> rdd = jsc.textFile("C:\\Globant\\SpringBoot\\src\\main\\resources\\dataset.csv");

        JavaRDD<Employee> rddEmp = rdd.map(string -> {
                    Employee employee = new Employee();
                    String[] arr = string.split(",");
                    employee.setEmpName(arr[0]);
                    employee.setEmpAge(Integer.valueOf(arr[1]));
                    employee.setEmpCity(arr[2]);
                    return employee;
                }
        );


    }
}
