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

class Sort_35 {
    void sort_test() {
        Student[] std = new Student[] { new Student("Lee", 19) , new Student("Kim", 18) , new Student("park", 20) };
        System.out.println("Sort_35...");
        Arrays.sort(std, Comparator.comparing(Student::getName));
        for(Student s : std)
            System.out.printf("%s", s.getName());
        System.out.printf("\n");
    }
}

public class STEP_14_Sort_3 {
    public static void main (String[] args){
        new Sort_35().sort_test();
    }
}