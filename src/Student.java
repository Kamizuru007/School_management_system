public class Student {
    private int id;
    private String name;
    private double grade;
    private double fees_paid;
    private final double fees_total;
    private double remaining_fees;

    Student(int id, String name,double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.fees_paid = 0;
        this.fees_total = 1800000;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public void updateFeesPaid(double fees){
        fees_paid = fees_paid + fees;
        School.setTotalMoneyEarned((fees_paid));
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
    public int getRemainingFees(){
        remaining_fees = fees_total - fees_paid;
        return (int) remaining_fees;
    }
}
