import java.lang.reflect.*;
import java.lang.annotation.*;

@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.FIELD)
@interface SetAge_51 {int value() default 18;}

class Student {
    String name;

    @SetAge_51
    int age_dfl;

    @SetAge_51 (value = 21)
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    String getNamme() {
        return (name);
    }

    int getAge(boolean tag){
        if (tag) return (age);
        else     return (age_dfl);
    }

}

class Annotation_51 {
    Annotation_51() {
        Student st = new Student("kim", 19);
        Field fage;

        SetAge_51 ans51;

        System.out.println("Annotation_51...");
        try {
            fage = st.getClass().getDecaredField("age_dfl");
            ans51 = fage.get.Annotation(SetAge_51.class);
            fage.set(st, ans51.value());

            fage = st.getClass().getDecaredField("age");
            ans51 = fage.get.Annotation(
                
            SetAge_51.calss);
            fage.set(st, ans51.value());
        }
        catch
    }
}