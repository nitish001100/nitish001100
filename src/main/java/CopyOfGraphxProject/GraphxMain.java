package CopyOfGraphxProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphxMain {
    public static void main(String[] args) {
        GraphxMain graphx = new GraphxMain();
        ArrayList<City> vD = graphx.getVertex();
        ArrayList<RelationShip> eD = graphx.getEdges();
        graphx.createGraph(vD, eD);
    }

    private void createGraph(ArrayList<City> vD, ArrayList<RelationShip> eD) {

    }

    private ArrayList<City> getVertex() {
        ArrayList<City> vertexList = new ArrayList<City>();
        City stpCity = new City(1, "Sitapur");
        City lkoCity = new City(2, "Lucknow");
        City lkmCity = new City(3, "Lkm");
        City shjCity = new City(4, "Shj");

        vertexList.add(stpCity);
        vertexList.add(lkoCity);
        vertexList.add(lkmCity);
        vertexList.add(shjCity);

        return vertexList;
    }

    private ArrayList<RelationShip> getEdges() {
        ArrayList<RelationShip> edgesList = new ArrayList<RelationShip>();

        RelationShip stpToLko = new RelationShip(1, 2, 90);
        RelationShip stpToLkm = new RelationShip(1, 3, 60);
        RelationShip stpToShj = new RelationShip(1, 4, 80);

        edgesList.add(stpToLko);
        edgesList.add(stpToLkm);
        edgesList.add(stpToShj);


        return edgesList;
    }

}

class RelationShip {
    private int srcCity;
    private int destCity;
    private int distance;

    public RelationShip(int srcCity, int destCity, int distance) {
        this.srcCity = srcCity;
        this.destCity = destCity;
        this.distance = distance;
    }

    public int getSrcCity() {
        return srcCity;
    }

    public int getDestCity() {
        return destCity;
    }

    public int getDistance() {
        return distance;
    }
}

class City {
    private String cityName;
    private int vertexID;

    public String getCityName() {
        return cityName;
    }

    public int getVertexID() {
        return vertexID;
    }

    public City() {
    }

    public City(int vertexID, String cityName) {
        this.vertexID = vertexID;
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", vertexID=" + vertexID +
                '}';
    }
}



