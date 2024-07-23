package baitapbuoi9;

public class InternationalStudent extends UndergraduteStudent{
    private String country;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(country);
    }

    public InternationalStudent(String studentId, String name, int age, String major, String country) {
        super(studentId, name, age, major);
        this.country = country;
    }

    public InternationalStudent(String studentld, String name, int age, String major) {
        super(studentld, name, age, major);
    }

    @Override
    public double calculateGPA() {
        return super.calculateGPA();
    }
}
