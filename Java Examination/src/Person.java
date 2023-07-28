
//Question4 ii
public class Person { //Declared a public class Person
    private int age;
    private double salary;

    public Person(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void personDetails(){
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);

    }
}
