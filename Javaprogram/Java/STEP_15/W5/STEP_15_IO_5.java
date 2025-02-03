import java.io.*;

import java.util.*;

class IO_51 {
    void io_test() {
            FileReader fr = null;
            BufferedReader br = null;

        try {
            fr = new FileReader("data.txt");
            br = new BufferedReader(fr);
        } catch (IOException e) {
            System.err.println("can't open 'data.txt' for input...");
            System.exit(1);
        }

        System.out.println("IO_51...");
        try {
            int ch1, ch2, ch3, n;
            char[] chs = new char[3];
            String str1, str2;

            ch1 = br.read(); ch2 = br.read(); ch3 = br.read();
            n = br.read(chs); n = br.read(chs, 0, 3);
            str1 = br.readLine();
            str2 = br.readLine();

            System.out.printf("%c %c %c\n", ch1, ch2, ch3);
            System.out.println("str1="+ str1);
            System.out.println("str2="+ str2);

            String line, word;
            while(true){
                if ((line = br.readLine()) == null) break;
                StringTokenizer tkn = new StringTokenizer(line, " , \t\n\r");
                while(tkn.hasMoreTokens()) {
                    word = tkn.nextToken();
                    System.out.println(word);
                }
            }
        }catch (IOException e) {
            System.err.println("character & line read error...");
            System.exit(2);
        }
    }
}   

class IO_52 {
    void io_test() {
        FileInputStream fr = null;
        try {
            fr = new FileInputStream("data.txt");
        }catch (FileNotFoundException e) {
            System.err.println("can't open 'data.txt' for input...");
            System.exit(1);
        }
        System.out.println("IO_52...");

        Scanner scan = new Scanner(fr); 
        while(scan.hasNextLine()){ //== ture 생략
            String line = scan.nextLine();
            StringTokenizer tkn = new StringTokenizer(line, "\t\n\r");
            while(tkn.hasMoreTokens()){
                String word = tkn.nextToken();

                System.out.println(word);
            }
        }
    }
}

class IO_53 {
    void io_test() {
        Scanner scan = null;
        try {
            scan = new Scanner(new File("data.txt"));
        }catch (FileNotFoundException e) {
            System.err.println("can't open 'data.txt' for input...");
            System.exit(1);
        }
        System.out.println("IO_53...");
        scan.useDelimiter("[ ,\t\n\r]+");

        while(scan.hasNext()){ //== ture 생략
            String word = scan.next();

            System.out.println(word);
        }
    }
}
public class STEP_15_IO_5 {
    public static void main(String[] args) {
        new IO_51().io_test();
        new IO_52().io_test();
        new IO_53().io_test();
    }
}
