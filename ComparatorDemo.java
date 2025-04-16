import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else    
            return -1;
    }
    
}


public class ComparatorDemo {
    public static void main(String[] args) {
        
        Comparator<Student> com = (i,j) -> i.age > j.age ? 1:-1;

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(19, "Raj"));
        studs.add(new Student(29, "Rohit"));
        studs.add(new Student(26, "Satyam"));
        studs.add(new Student(24, "Saurabh"));
        studs.add(new Student(27, "Prajyot"));

        Collections.sort(studs,com);
        for(Student s : studs)
        System.out.println(s);
    }
}
