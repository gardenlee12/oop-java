import java.io.*;

class Point_1{
    int x;
    int y;

    Point_1(int x, int y){
        this.x = x;
        this.y = y;
    }

    void set_xy(int x, int y){
        this.x = x;
        this.y = y;
    }
    void set_x(int x) {this.x = x;}
    void set_y(int y) {this.y = y;}
    int get_x() {return x;}
    int get_y() {return y;}
}

class Line_1 extends Point_1{
    int a, b;

    Line_1(int x, int y, int a, int b){
        super(x, y); 
    }
    void set_ab(int a, int b){
        this.a = a;
        this.b = b;
    }
    void set_a(int a) {this.a = a;}
    void set_b(int b) {this.b = b;}
    int get_a() {return a;}
    int get_b() {return b;}

}