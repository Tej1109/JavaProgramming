public class Super {
    public static void main(String[] args){
        Person person = new Person("John" , "Doe");
        person.showName();

        Student2 student = new Student2("James","Corden",2.43);
        student.showName();
        student.showGPA();

        Employee emp = new Employee("HomeR","Simpson",2300.23);
        emp.showName();
        emp.showSalary();
    }
}
