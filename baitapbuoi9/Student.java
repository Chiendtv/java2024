package baitapbuoi9;

public abstract class Student {
    protected String studentId;//mã sinh viên
  protected String name;
    protected int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateGPA();

    public void displayInfo() {
        System.out.println(studentId);
        System.out.println(name);
        System.out.println(age);
    }
}
