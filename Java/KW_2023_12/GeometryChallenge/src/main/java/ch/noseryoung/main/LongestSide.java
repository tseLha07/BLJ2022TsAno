package ch.noseryoung.main;

import java.util.Comparator;

public class LongestSide implements Comparator<Triangle> {
    @Override
    public int compare(Triangle t1, Triangle t2) {
        double tri1Largest = getLongestSide(t1);
        double tri2Largest = getLongestSide(t2);
        double tri1SeLargest = getSecondLongestSide(t1);
        double tri2SeLargest = getSecondLongestSide(t2);
        double tri1Shortest = getShortestSide(t1);
        double tri2Shortest = getShortestSide(t2);

        if(tri1Largest == tri2Largest){
            if(tri1SeLargest == tri2SeLargest){
                if(tri1Shortest == tri2Shortest){
                    return 0;
                }else if(tri1Shortest > tri2Shortest){
                    return -1;
                }else{
                    return 1;
                }
            }else if(tri1SeLargest > tri2SeLargest){
                return -1;
            }else{
                return 1;
            }
        }else if(tri1Largest > tri2Largest){
            return -1;
        }else{
            return 1;
        }
    }

    private double getLongestSide(Triangle t) {
        if (t.getA() > t.getB() && t.getA() > t.getC()) {
            return t.getA();
        } else if (t.getB() > t.getA() && t.getB() > t.getC()) {
            return t.getB();
        } else if (t.getC() > t.getA() && t.getC() > t.getB()) {
            return t.getC();
        }else if (t.getA() == t.getB() && t.getA() == t.getC()){
            return t.getA();
        }else if (t.getA() == t.getB() && t.getA() > t.getC()){
            return t.getA();
        }else if(t.getA() == t.getB() && t.getA() < t.getC()){
            return t.getC();
        }else if(t.getB() == t.getC() && t.getB() > t.getA()){
            return t.getB();
        }else if(t.getB() == t.getC() && t.getB() < t.getA()){
            return t.getA();
        }else if(t.getA() == t.getC() && t.getC() > t.getB()){
            return t.getC();
        }else if(t.getA() == t.getC() && t.getC() < t.getB()){
            return t.getB();
        }
        return 0;
    }

    private double getSecondLongestSide(Triangle t) {
        if (t.getA() > t.getB() && t.getA() < t.getC()) {
            return t.getA();
        } else if (t.getB() > t.getA() && t.getB() < t.getC()) {
            return t.getB();
        } else if (t.getC() > t.getA() && t.getC() < t.getB()) {
            return t.getC();
        }else if (t.getA() == t.getB() && t.getA() == t.getC()){
            return t.getB();
        }else if (t.getA() == t.getB() && t.getA() > t.getC()){
            return t.getC();
        }else if(t.getA() == t.getB() && t.getA() < t.getC()){
            return t.getA();
        }else if(t.getB() == t.getC() && t.getB() > t.getA()){
            return t.getA();
        }else if(t.getB() == t.getC() && t.getB() < t.getA()){
            return t.getB();
        }else if(t.getA() == t.getC() && t.getC() > t.getB()){
            return t.getB();
        }else if(t.getA() == t.getC() && t.getC() < t.getB()){
            return t.getC();
        }
        return 0;
    }

    private double getShortestSide(Triangle t) {
        if (t.getA() < t.getB() && t.getA() < t.getC()) {
            return t.getA();
        } else if (t.getB() < t.getA() && t.getB() < t.getC()) {
            return t.getB();
        } else if (t.getC() < t.getA() && t.getC() < t.getB()) {
            return t.getC();
        }return 0;
    }
}
