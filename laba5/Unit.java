public class Unit {
    private int x;
    private int y;
    private boolean selected = false;

    public Unit(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }

    public boolean getSelected(){
        return selected;
    }
    public void setSelected(boolean selected){
        this.selected=selected;
    }
}