import java.io.*;

class STEP_06_PointLine_1{
    public static void main(String args[]) throws IOException{
        Line_1 line;
        int x, y, a, b;
        double dl;

        x = System.in.read() - '0';
        y = System.in.read() - '0';
        a = System.in.read() - '0';
        b = System.in.read() - '0';

        line = new Line_1(x, y, a, b);

        dl =   Math.sqrt(Math.pow(line.get_x() - line.get_a(), 2) + Math.pow(line.get_y() - line.get_b(), 2));

        System.out.printf("dl = %f\n", dl);
    }
}