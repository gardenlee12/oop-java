import java.util.*;
class Student {
    String name;
    Integer age;
    Student(String name, Integer age) {
        this.name = name; this.age = age;
    }
    String getName(){
        return(name);
    }
}
class Sort_11 {
    void sort_test() {
        int[] mrk = { 19, 18, 20};
        System.out.println("sort_11...");
        Arrays.sort(mrk);
        for(int i : mrk)
            System.out.printf("%d", i);
        System.out.printf("\n");
    }
}
class Sort_14 {
    void sort_test() {
        Student[] std = { new Student("Lee", 19) , new Student("Kim", 18) , new Student("park", 20) };
        System.out.println("sort_14...");
        Arrays.sort(std);
        Arrays.sort(std, Collections.reverseOrder());
        for(Student s : std)
            System.out.printf("%s", s.getName());
        System.out.printf("\n");
    }
}
public class STEP_14_Sort_1 {
    public static void main(String[] args) {
        new Sort_11().sort_test();
        new Sort_14().sort_test();
    }
}