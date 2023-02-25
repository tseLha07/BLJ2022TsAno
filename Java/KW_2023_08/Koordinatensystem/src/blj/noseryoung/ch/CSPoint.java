package blj.noseryoung.ch;

import java.awt.*;

public class CSPoint extends Point {

    private int id = 0;

    public CSPoint(int x, int y){
        super(x, y);
    }

    @Override
    public String toString(){
        return id + getX() + "," + getY();
    }
}
