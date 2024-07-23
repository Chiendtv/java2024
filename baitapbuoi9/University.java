package baitapbuoi9;

import java.util.List;
import java.util.ArrayList;

class University {
    private List<Student> students;
    public University(){
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void displayAllStudents(){
        for(Student student:students){
            student.displayInfo();
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        UndergraduteStudent st1 = new UndergraduteStudent("ST1","Nguyen Van A",20,"Khoa Toan");
        UndergraduteStudent st2 = new UndergraduteStudent("ST2","Nguyen Van B",21,"Khoa Van");
        UndergraduteStudent st3 = new UndergraduteStudent("ST3","Nguyen Van C",20,"Khoa Van");
       University university = new University();
        university.addStudent(st1);
        university.addStudent(st2);
        university.addStudent(st3);

        System.out.println("Danh sach cac sinh vien: ");
        university.displayAllStudents();
    }
}
