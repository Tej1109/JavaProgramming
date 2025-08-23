public class Student {
    String name;
    int age;
    int rollNo;
    boolean isStudying;

    Student(){
        this.name = "";
        this.age = 0;
        this.rollNo = 0;
        this.isStudying = false;
    }
    Student(String name){
        this.name = name;
        this.age = 0;
        this.rollNo = 0;
        this.isStudying = true;
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
        this.rollNo = 0;
        this.isStudying = true;
    }

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.isStudying = true;
    }

}
