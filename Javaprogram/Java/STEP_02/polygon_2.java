import java.io.*;

class Polygon{
    int npolygon ;

    Polygon()
    {
        npolygon = 0;
    }

    class Triangle{
        int height, width;
        Triangle(int height, int width){
            this.height = height;
            this.width = width;
            npolygon++;
        }
    }

    class Rectangle{
        int height, width;
        Rectangle(int height, int width){
            this.height = height;
            this.width = width;
            npolygon++;
        }
    }
}

class STEP_03_Polygon_2{
    public static void main(String args[]) throws IOException{
        Polygon polygon;
        Polygon.Triangle add1, add2;
        Polygon.Rectangle sub1, sub2;
        int x, y;
        x = System.in.read() - '0'; height = x; 
        y = System.in.read() - '0'; width = y; 

        polygon = new Polygon();

        add1 = polygon.new Add();
        add2 = polygon.new Add();
        sub1 = polygon.new Sub();
        sub2 = polygon.new Sub();
    }
}
