import java.io.*;
import java.util.*;

class Step_05_random_5{
    public static void main(String args[]) throws IOException {
        Random_5 rnd1, rnd2;

        rnd1 = new Random_5(5);
        rnd2 = new Random_5(7);

        System.out.printf("seed = 5 %d", rnd1.outRnums());
        System.out.printf("seed - 5 max %d", rnd1.getMax());
        System.out.printf("seed = 7 %d", rnd2.outRnums());
        System.out.printf("seed - 7 max %d", rnd2.getMax());
    }

}