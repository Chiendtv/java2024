package BaiTap_Collections;

import java.util.HashSet;
import java.util.Set;

public class test_Student {
    public static void main(String[] args) {
        Set<Bai4_Student> students = new HashSet<>();
        Bai4_Student sv1 = new Bai4_Student(1,"a","1A");
        Bai4_Student sv2 = new Bai4_Student(2,"b","2A");
        Bai4_Student sv3 = new Bai4_Student(3,"c","3A");
        Bai4_Student sv4 = new Bai4_Student(4,"d","4A");
        Bai4_Student sv5 = new Bai4_Student(5,"e","5A");
        students.add(sv1);
        students.add(sv2);
        students.add(sv3);
        students.add(sv4);
        students.add(sv5);
        students.add(sv1);

        for(Bai4_Student student:students){
            System.out.println(student);
        }
//trong set ko co chua cac phan tu trung lap nen ko the them 1 sinh vien co id 1 vao duoc
    }
}
