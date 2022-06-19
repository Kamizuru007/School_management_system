import java.util.ArrayList;
import java.util.List;

public class Main {
    //What is polymorphism? -Polymorphism means "many forms",
    // and it occurs when we have many classes that are related to each other by inheritance






    //what is abstraction?-Data abstraction is the process of hiding certain details and
    // showing only essential information to the user
    //The abstract keyword is a non-access modifier,
    //abstract class can have both abstract and regular methods
    //    Abstract class: is a restricted class that cannot be used to create objects
    //    (to access it, it must be inherited from another class).
    //
    //    Abstract method: can only be used in an abstract class, and it does not have a body.
    //    The body is provided by the subclass (inherited from).



    //wht is inheritance?-it is possible to inherit attributes and methods from one class to another.
    //We group the "inheritance concept" into two categories:
    //
    //    subclass (child) - the class that inherits from another class
    //    superclass (parent) - the class being inherited from



    //what is encapsulation? -
    //The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must://
    //declare class variables/attributes as private
    //provide public get and set methods to access and update the value of a private variable

    //public - The code is accessible for all classes
    //private - The code is only accessible within the declared class
    //protected - The code is accessible in the same package and subclasses.
    //final - Attributes and methods cannot be overridden/modified
    //static - Attributes and methods belongs to the class, rather than an object
    //abstract - Can only be used in an abstract class, and can only be used on methods. The method does not have a body

    public static void main(String[] args) {
        Teacher T1 = new Teacher(1,"Lizzy",10000);
        Teacher T2 = new Teacher(2,"rosi",15000);
        Teacher T3 = new Teacher(3,"karen",25000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(T1);
        teacherList.add(T2);
        teacherList.add(T3);

        Student S1 = new Student(1,"kareem",56);
        Student S2 = new Student(2 ,"Suvi",100);
        Student S3 = new Student(3,"Yasi",99);

        List<Student> studentList = new ArrayList<>();
        studentList.add(S1);
        studentList.add(S2);
        studentList.add(S3);

        School IIT = new School(teacherList,studentList);


        S1.updateFeesPaid(10000);
        System.out.println(S1.getName()+"'s Remaining fees: "+S1.getRemainingFees());
        S2.updateFeesPaid(100000);
        System.out.println(S2.getName()+"'s Remaining fees: "+S2.getRemainingFees());
        S3.updateFeesPaid(1250000);
        System.out.println(S3.getName()+"'s Remaining fees: "+S3.getRemainingFees());

        System.out.println();

        T1.givenSalary(1000);
        System.out.println(T1.getName()+"'s Remaining Salary: "+T1.remainingSalary());
        T2.givenSalary(5500);
        System.out.println(T2.getName()+"'s Remaining Salary: "+T2.remainingSalary());
        T3.givenSalary(17000);
        System.out.println(T3.getName()+"'s Remaining Salary: "+T3.remainingSalary());

        System.out.println();

        System.out.println("IIT has earned : " + IIT.getTotalMoneyEarned()+"//");
        System.out.println("IIT has spent  : " + IIT.getTotalMoneySpent()+"//");
        System.out.println("IIT has Remain of :"+(IIT.getTotalMoneyEarned()-IIT.getTotalMoneySpent())+"//");

    }
}



