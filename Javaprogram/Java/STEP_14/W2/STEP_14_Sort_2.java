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
class stdComparator implements Comparator<Student> {
   public int compare(Student s1, Student s2) {
    int c;
    c = s1.getName().compareTo(s2.getName());
    return(c);
   } 
}
class Sort_21 {
    void sort_test() {
        Student[] std = new Student[] { new Student("Lee", 19) , new Student("Kim", 18) , new Student("park", 20) };
        System.out.println("sort_21...");
        Arrays.sort(std, new stdComparator());
        for(Student s : std)
            System.out.printf("%s", s.getName());
        System.out.printf("\n");
    }
}
/*public class STEP_14_Sort_1 {
    public static void main(String[] args) {
        new Sort_11().sort_test();
        new Sort_14().sort_test();
    }
}*/