package blj.noseryoung.ch;
import java.util.ArrayList;

public class CoordinateSystem {

    private ArrayList<CSPoint> points = new ArrayList<>();
    private ArrayList<CSLineSegment> allLine = new ArrayList<>();
    private ArrayList<CSCircle> allCircles = new ArrayList<>();
    private ArrayList<CSRectangle> allRectangles = new ArrayList<>();

    private final int size;

    public CoordinateSystem(ArrayList<CSPoint> points, int size, ArrayList<CSLineSegment> allLine, ArrayList<CSCircle> allCircles, ArrayList<CSRectangle> allRectangles){
        this.points = points;
        this.size = size;
        this.allLine = allLine;
        this.allCircles = allCircles;
        this.allRectangles = allRectangles;
    }

    public ArrayList<CSPoint> getAllPoints() {
        return points;
    }

    public ArrayList<CSLineSegment> getAllLine() {
        return allLine;
    }

    public ArrayList<CSCircle> getAllCircles() {
        return allCircles;
    }

    public ArrayList<CSRectangle> getAllRectangles() {
        return allRectangles;
    }

    public int getCoordinateSystemSize() {
        return size;
    }
}
