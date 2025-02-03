import kor.point.*;

public class Line_5 extends Point_5{
    int a, b;

    public Line_5(int x, int y, int a, int b){
        super(x, y);
        this.a = a; this.b = b;
    }

    int get_a() { if (a < 0) return 0; else return a;}
    int get_b() { if (b < 0) return 0; else return b;}

    int get_x() {
        if (super.get_x() > 0) return (super.get_x()); 
        else return (0);
    }
    int get_y(){
        if (super.get_y() > 0) return (super.get_y());
        else return (0);
    }

    public double get_dl(){
        double dl;
        dl = Math.sqrt(Math.pow(get_x() - a, 2) + Math.pow(get_y() - b, 2));
    }
}