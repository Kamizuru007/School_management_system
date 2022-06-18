import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int TotalMoneyEarned;
    private int TotalMoneySpent;


    //constructer
    public School (List<Teacher> teachers,List<Student> students){
      this.teachers = teachers;
      this.students = students;
      this.TotalMoneyEarned = 0;
      this.TotalMoneySpent = 0;
    }

    public int getTotalMoneyEarned() {
        return TotalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return TotalMoneySpent;
    }

    public List<Student> getStudents() {
        return students;
    }

    //returns the list of teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }

    //add a student
    public void addStudents(Student student) {
        students.add(student);
    }

    //add a teacher
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public static void setTotalMoneyEarned(int totalMoneyEarned) {
        TotalMoneyEarned = TotalMoneyEarned + totalMoneyEarned;
    }

    public void setTotalMoneySpent(int MoneySpent) {
        TotalMoneySpent = TotalMoneyEarned - MoneySpent;
    }
}
