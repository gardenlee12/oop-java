import java.util.*;
class Student {
    String name;
    Integer age;
    Student(String name, Integer age){
        this.name = name ; this.age = age;
    }
    String getName(){
        return(name);
    }
}

class ArrayList_31 {
    void arrayList_test() {
        ArrayList<Integer> data1 = new ArrayList<Integer>();
        ArrayList<Integer> data2;
        data2 = new ArrayList<Integer>();
        for (int i = 0 ; i < 9 ; i++){
            data2.add(i);
        }
        int i1 = data2.indexof(new Integer(8));
        int i2 = data2.indexof(8);
        int i3 = data2.indexof(12);
        System.out.printf("31: size=%d, il=%d, i2=%d, i3=%d\n", data2.size(), i1, i2, i3);
        }
}

class ArrayList_32 {
    void arratList_test() {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Kim");
        name.add("Lee");
        name.add("Park");

        int j1 = name.indexof(new String("Lee"));
        int j2 = name.indexof("Lee");
        int j3 = name.indexof("choi");
        System.out.printf("32: size=%d, j1=%d, j2=%d, j3=%d\n",name.size() , j1, j2, j3);
    }
}

class ArrayList_33 {
    void arrayList_test() {
        ArrayList<Student> std = new ArrayList<>();
        Student lee = new Student("Lee", 19);
        std.add(new Student("Lee", 19));
        std.add(lee);
        std.add(new Student("Kim", 18));
        std.add(new Student("Park", 20));
        int le1 = std.indexof(lee);
        int le2 = std.indexof(new Student("Lee", 19));
        System.out.printf("33: size=%d, k1=%d, k2=%d\n", std.size(), le1, le2);
    }
}

public class STEP_13_Array_3{
    public static void main(String[] args)
    {
        new ArrayList_31().arrayList_test();
        new ArrayList_32().arrayList_test();
        new ArrayList_33().arrayList_test();  
    }
}
