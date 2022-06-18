public class Student {
    private int id;
    private String name;
    private double grade;
    private double fees_paid;
    private double fees_total;

    Student(int id, String name){
        id = this.id;
        name = this.name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setFees_paid(double fees_paid) {
        this.fees_paid = fees_paid;
    }

    public void setFees_total(double fees_total) {
        this.fees_total = fees_total;
    }

    public double getFees_paid() {
        return fees_paid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public double getFees_total() {
        return fees_total;
    }
}
