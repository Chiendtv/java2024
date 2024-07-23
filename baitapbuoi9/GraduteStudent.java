package baitapbuoi9;

public class GraduteStudent extends Student{
    protected String reseachTopic;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(reseachTopic);
    }

    public GraduteStudent(String studentId, String name, int age, String reseachTopic) {
        super(studentId, name, age);
        this.reseachTopic = reseachTopic;
    }

    @Override
    public double calculateGPA() {
        return 0;
    }
}
