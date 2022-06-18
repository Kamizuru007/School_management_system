public class Teacher {
    private int id;
    private String name;
    private double salary;
    private double sal;


    Teacher(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //returningID
    public int getId() {
        return id;
    }
    //returningName
    public String getName() {
        return name;
    }
    //returningSalary
    public double getSalary() {
        return salary;
    }
    public void givenSalary(int Salary){
        salary = salary - Salary;
        sal = sal+Salary;
        School.setTotalMoneySpent((int) sal);
    }
    public int remainingSalary(){
        return (int) salary;
    }
}
