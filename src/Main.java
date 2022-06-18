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
        System.out.println("IIT has earned :" + IIT.getTotalMoneyEarned());

        S1.updateFeesPaid(10000);
        System.out.println(S1.getRemainingFees());


    }
}



