// refer to Student class for this
public class ClassConstructor {
    public static void main(String[] args){
        Student student = new Student("John");
        Student student1 = new Student("Kapow",23);
        Student student2 = new Student("James",23,4089);
        Student student3 = new Student();
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.rollNo);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.rollNo);
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.rollNo);

        System.out.println(student3.name);
    }
}
