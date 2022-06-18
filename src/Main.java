import java.util.ArrayList;
import java.util.List;

public class Main {
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

        System.out.println("IIT has earned : " + IIT.getTotalMoneyEarned()+"//"
        );
        System.out.println("IIT has spent  : " + IIT.getTotalMoneySpent()+"//");
        System.out.println("IIT has Remain of :"+(IIT.getTotalMoneyEarned()-IIT.getTotalMoneySpent())+"//");

    }
}



