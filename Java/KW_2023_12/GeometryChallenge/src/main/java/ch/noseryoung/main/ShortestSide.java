package ch.noseryoung.main;

import java.util.Comparator;

public class ShortestSide implements Comparator<Triangle> {
    @Override
    public int compare(Triangle t1, Triangle t2) {
        double tri1Shortest = getShortestSide(t1);
        double tri2Shortest = getShortestSide(t2);
        double tri1SeShortest = getSecondShortestSide(t1);
        double tri2SeShortest = getSecondShortestSide(t2);
        double tri1ThiShortest = getThirdShortestSide(t1);
        double tri2ThiShortest = getThirdShortestSide(t2);

        if(tri1Shortest == tri2Shortest){
            if(tri1SeShortest == tri2SeShortest){
                if(tri1ThiShortest == tri2ThiShortest){
                    return 0;
                }else if(tri1ThiShortest > tri2ThiShortest){
                    return 1;
                }else{
                    return -1;
                }
            }else if(tri1SeShortest > tri2SeShortest){
                return 1;
            }else{
                return -1;
            }
        }else if(tri1Shortest > tri2Shortest){
            return 1;
        }else{
            return -1;
        }
    }

    private double getShortestSide(Triangle t) {
        if (t.getA() < t.getB() && t.getA() < t.getC()) {
            return t.getA();
        } else if (t.getB() < t.getA() && t.getB() < t.getC()) {
            return t.getB();
        } else if (t.getC() < t.getA() && t.getC() < t.getB()) {
            return t.getC();
        }else if (t.getA() == t.getB() && t.getA() == t.getC()){
            return t.getA();
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

    private double getSecondShortestSide(Triangle t) {
        if (t.getA() > t.getB() && t.getA() < t.getC()) {
            return t.getA();
        } else if (t.getB() > t.getA() && t.getB() < t.getC()) {
            return t.getB();
        } else if (t.getC() > t.getA() && t.getC() < t.getB()) {
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

    private double getThirdShortestSide(Triangle t) {
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
        }return 0;
    }
}
