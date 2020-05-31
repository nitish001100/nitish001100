package com.springerNature;


import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.SparkSession;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {

        SparkConf sparkConf = new SparkConf()
                .setAppName("SpringerNature");

        SparkSession sparkSession = SparkSession.builder().config(sparkConf)
                .getOrCreate();

        JavaSparkContext jsc = JavaSparkContext.fromSparkContext(sparkSession.sparkContext());

        JavaRDD<String> textFile = jsc.textFile("C:\\Users\\nitish.saxena\\Desktop\\File1.txt");

        Function<String, String> function = new Function<String, String>() {
            @Override
            public String call(String s) throws Exception {
                String[] str = s.split(" ");
                return null;
            }
        };


        textFile.map(function);
    }
}
