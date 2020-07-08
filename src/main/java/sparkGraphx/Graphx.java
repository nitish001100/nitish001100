package sparkGraphx;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.spark.*;
import org.apache.spark.rdd.RDD;
import org.apache.spark.graphx.*;

public class Graphx {
    public static void main(String[] args) {
        SparkConf sparkConf = new SparkConf().setAppName("Graphx").setMaster("local[*]");

        SparkSession sparkSession = SparkSession.builder()
                .config(sparkConf)
                .getOrCreate();

        SparkContext sc = sparkSession.sparkContext();

        List<Map<Long, String>> vertices = new ArrayList<>();

        HashMap<Long, String> hm1 = new HashMap<>();
        HashMap<Long, String> hm2 = new HashMap<>();
        HashMap<Long, String> hm3 = new HashMap<>();

        hm1.put(1L, "SFO");
        hm1.put(2L, "ORD");
        hm1.put(3L, "DFW");

        vertices.add(hm1);
        vertices.add(hm2);
        vertices.add(hm3);

        JavaRDD<Map<Long, String>> vRDD = JavaSparkContext.fromSparkContext(sc).parallelize(vertices);


        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge(1L, 2L, 1800));
        edges.add(new Edge(2L, 3L, 800));
        edges.add(new Edge(3L, 1L, 1400));

        JavaRDD<Edge> eRDD = JavaSparkContext.fromSparkContext(sc).parallelize(edges);



    }
}
