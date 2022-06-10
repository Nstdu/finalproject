package pkg;
public class Charx{
    public  Line one;
    public  Line two;
    public Charx(double x,double y){
        one = new Line(x,y,x+100,y+100);
        one.draw();
        two = new Line(x+100,y,x,y+100);
        two.draw();
    }
}