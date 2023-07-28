import java.util.Scanner;
//Question2 i
//A private modifier gives access to class attributes only within that particular class
// A public access modifier gives access to class attributes when accessed from anywhere both within a class and outside the class.
//A protected modifier gives access to class attributes to only particular classes that are inheriting from the specific parent class.

//Question4 i
// A class refers a collection of related objects.For example Animal is a class.
//Whereas an object refers to an instance of a class. For example a cow, a goat and a cat are examples of
// objects of the class Animal.
public class Main {
    public static void main(String[] args) {
        //Question1 iii a
        //Question1 ii
        //Question1 iii a
        int a =-5+8*6;
        System.out.println(a);

        //Question1 iii b
        int b =(55+9)%9;
        System.out.println(b);
        //Question1 iii c
        int c =20+-3*5/8;
        System.out.println(c);

        //Question1 iii d
        int d = 5+15/3*2-8%3;
        System.out.println(d);

        //Question1 ii
        Scanner num = new Scanner(System.in); //created scanner object
        System.out.println("number1");
        int f = num.nextInt();


        System.out.println("number2");
        int h = num.nextInt();


        System.out.println("number3");
        int t = num.nextInt();


        System.out.println("number4");
        int j = num.nextInt();


        System.out.println("number5");
        int e = num.nextInt();


        System.out.println((h + t + j + f + e) / 5);
       // Question4 ii
        System.out.println("Question4 ii solution");
        //Creatiing Person object
        Person person1= new Person(22,50000);
        Person person2= new Person(23,70000);
        System.out.println("Getting values of objects of Person class");
        System.out.println( "Person1's details");
        person1.personDetails();
        System.out.println( "Person2's details");
        person2.personDetails();

        System.out.println("Setting values of objects of Person class to new values");
        person1.setAge(24);
        person1.setSalary(60000);
        person2.setAge(25);
        person2.setSalary(80000);
        System.out.println( "Person1's details");
        person1.personDetails();
        System.out.println( "Person2's details");
        person2.personDetails();

        //Question2 ii
            Restaurant restaurant = new Restaurant();
            restaurant.addItem("Burger", 8.99);
            restaurant.addItem("Pizza", 10.99);
            restaurant.addItem("Salad", 6.00);

            System.out.println("Menu:Item & Price");
            restaurant.displayMenu();

            restaurant.addRating("Burger", 4);
            restaurant.addRating("Burger", 5);
            restaurant.addRating("Pizza", 3);
            restaurant.addRating("Pizza", 4);
            restaurant.addRating("Salad", 2);

            double averageRating = restaurant.getAverageRating("Burger");
            System.out.println("\nAverage rating for Burger: " + averageRating);
            averageRating = restaurant.getAverageRating("Pizza");
            System.out.println("Average rating for Pizza: " + averageRating);
            averageRating = restaurant.getAverageRating("Salad");
            System.out.println("Average rating for Salad: " + averageRating);
            System.out.println("Average rating: " + restaurant.calculateAverageRating());
            System.out.println("\nRemove 'Pizza' from the above menu.");
            restaurant.removeItem("Pizza");
            System.out.println("\nUpdated menu:");
            restaurant.displayMenu();

            //Question2 iii
        System.out.println("Question2 iii solutions");
        //Created objects of class Student
        Student student1= new Student("Abbo Flo",99);
        Student student2= new Student("Adee Joyce",98);
        Student student3= new Student("Abbo Mary",97);
        System.out.println("Student Details without Courese");
        student1.studentDetails();
        student2.studentDetails();
        student3.studentDetails();
        System.out.println("Adding Courses");

        System.out.println("Student Details with Courses");
        student1.studentDetails();
        student1.addCourses("Java");
        student1.addCourses("Reactjs");
        System.out.println(student1.getCourses());

        student2.studentDetails();
        student2.addCourses("Javascript");
        System.out.println(student2.getCourses());

        student3.studentDetails();
        student3.addCourses("CSS");
        System.out.println(student3.getCourses());
        System.out.println("Removing a course");
        student1.removeCourses("Reactjs");
        System.out.println(student1.getCourses());

        //Question4 iii
        System.out.println("Question4 iii");
        //Created objects of class box
        Box box1 = new Box(2f);
        System.out.println("Got the Box width");
        System.out.println(box1.getWidth());
        System.out.println("Updated the Box width");
        box1.setWidth(4f);
        System.out.println(box1.getWidth());

        //Question1 iv
        // Created objects of AnimalS class
        Animals animal1 =new Animals();
        Animals animal2 =new Animals();
        Animals animal3 =new Animals();
        Animals animal4 =new Animals();
        Animals animal5 =new Animals();
        System.out.println("Displaying all animals");
        animal1.addAnimals("Cow");
        animal2.addAnimals("Goat");
        animal3.addAnimals("Dog");
        animal4.addAnimals("Sheep");
        animal5.addAnimals("Cat");

        System.out.println(animal1.getAnimals());
        System.out.println(animal2.getAnimals());
        System.out.println(animal3.getAnimals());
        System.out.println(animal4.getAnimals());
        System.out.println(animal5.getAnimals());
        }
    }
