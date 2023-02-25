package blj.noseryoung.ch;
import java.util.ArrayList;
import java.awt.*;

public class Starter {
    public static void main(String[] args) {

        CSPoint p1 = new CSPoint(100, 90);
        CSPoint p2 = new CSPoint(100, 150);
        CSLineSegment l1 = new CSLineSegment( new CSPoint(140,80), new CSPoint(140,160));

        ArrayList<CSPoint> point = new ArrayList<CSPoint>();
        point.add(p1);
        point.add(p2);

        ArrayList<CSLineSegment> lineSegment = new ArrayList<CSLineSegment>();
        lineSegment.add(l1);

        CoordinateSystem cs = new CoordinateSystem(point, 500, lineSegment);
        new CSRenderer(cs);
    }
}
