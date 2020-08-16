package sparkGraphX

import org.apache.spark.graphx._
import org.apache.spark.sql.SparkSession


object Runner {
  def main(args: Array[String]): Unit = {

    val vertices = Array((1L, ("SFO")), (2L, ("ORD")), (3L, ("DFW")))
    val sparkSession = SparkSession.builder().master("local[*]").appName("Graphx").getOrCreate();
    val sc = sparkSession.sparkContext

    val vRDD = sc.parallelize(vertices)
    vRDD.take(1)

    val nowhere = "nowhere"

    val edges = Array(Edge(1L, 2L, 1800), Edge(2L, 3L, 800), Edge(3L, 1L, 1400))
    val eRDD = sc.parallelize(edges)

    eRDD.take(2)

    val graph = Graph(vRDD, eRDD, nowhere)

    graph.vertices.collect.foreach(println)

    graph.edges.collect.foreach(println)

    val numairports = graph.numVertices
    println("******************************** " + numairports + " ********************************")

    val numroutes = graph.numEdges
    println("******************************** " + numroutes + " ********************************")

    graph.edges.filter { case Edge(src, dst, prop) => prop > 1000 }.collect.foreach(println)

    graph.triplets.take(3).foreach(println)

    graph.triplets.sortBy(_.attr, ascending = false).map(triplet =>
      "Distance " + triplet.attr.toString + " from " + triplet.srcAttr + " to " + triplet.dstAttr + ".").collect.foreach(println)
  }
}
