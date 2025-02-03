import java.io.*;

class Student {
    Student name;
    int age;
    Student(String name, int age){ setName(name); this.age = age;}
    String getName() {return(name); }
    int getAge() {return(age);}
    void setName(String name) {
        this.name = name + "    ".substring(0, 5-name.length());
    }
    void setAge(int age) {this.age = age;}
}

class IO_72 {
    void io_test() {
        RandomAccessFile raf = null;
        System.out.println("IO_72...");
        try{
            raf = new RandomAccessFile("record.bin","rw");
        }catch (FileNotFoundException e){
            System.err.println("Random file open error....");
            System.exit(1);
        }
        Student st;
        try{
            raf.seek((7+4)*2);
            st = new Student(raf.readUTF(), raf.readInt());
            System.out.println("3rd: "+ st.getName()","+ st.getAge());
            raf.seek((7+4)*0);
            st = new Student(raf.readUTF(), raf.readInt(    ));
            System.out.println("1st: "+ st.getName()","+ st.getAge());
            raf.seek((7+4)*1);
            st = new Student(raf.readUTF(), raf.readInt());
            System.out.println("2nd: "+ st.getName()","+ st.getAge());
            raf.close();   
        }catch (IOException e){
        }
        System.out.println("Random file read success....");
    }
}

public class STEP_15_IO_7{
    public static void main(String[] args){
        new IO_72().io_test();
    }
}