package baitapbuoi9;

public class UndergraduteStudent extends Student{
    protected String major;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(major);
    }

    public UndergraduteStudent(String studentId, String name, int age, String major) {
        super(studentId, name, age);
        this.major = major;
    }

    @Override
    public double calculateGPA() {
        return 0;
    }
}
