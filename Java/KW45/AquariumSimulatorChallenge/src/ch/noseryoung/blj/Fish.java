package ch.noseryoung.blj;

public class Fish
{
    private String name;
    private boolean isSaltwater = true;
    private int x;
    private int y;

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isSaltwater() {
        return isSaltwater;
    }
}
