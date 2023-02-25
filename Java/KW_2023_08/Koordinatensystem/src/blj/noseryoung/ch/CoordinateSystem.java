package blj.noseryoung.ch;
import java.util.ArrayList;

public class CoordinateSystem {

    private ArrayList<CSPoint> points = new ArrayList<>();
    private ArrayList<CSLineSegment> allLine = new ArrayList<>();

    private final int size;

    public CoordinateSystem(ArrayList<CSPoint> points, int size, ArrayList<CSLineSegment> allLine){
        this.points = points;
        this.size = size;
        this.allLine = allLine;
    }

    public ArrayList<CSPoint> getAllPoints() {
        return points;
    }

    public ArrayList<CSLineSegment> getAllLine() {
        return allLine;
    }

    public int getCoordinateSystemSize() {
        return size;
    }
}
