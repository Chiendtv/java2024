package BaiTap_LapTrinhHuongDoiTuong;

import java.util.Scanner;

public class main_SinhVien {
    public static void main(String[] args) {

       /* Bai3_SinhVien sinhVien1 = new Bai3_SinhVien(01,"Nguyen A",7,9);
        Bai3_SinhVien sinhVien2 = new Bai3_SinhVien(02,"Nguyen B",5,6);
        Bai3_SinhVien sinhVien3 = new Bai3_SinhVien(03,"Nguyen C",8,5);
        System.out.println(sinhVien1);
        System.out.println(sinhVien2);
        System.out.println(sinhVien3);*/

        Bai3_SinhVien sv1 = new Bai3_SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien 1: ");
        sv1.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ho ten sinh vien 1: ");
        sv1.setHoTen(sc.nextLine());
        System.out.print("Nhap diem ly thuyet sinh vien 1: ");
        sv1.setDiemLyThuyet(sc.nextDouble());
        System.out.print("Nhap diem thuc hanh sinh vien 1: ");
        sv1.setDiemThucHanh(sc.nextDouble());

        Bai3_SinhVien sv2 = new Bai3_SinhVien();

        System.out.print("Nhap ma sinh vien 2: ");
        sv2.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ho ten sinh vien 2: ");
        sv2.setHoTen(sc.nextLine());
        System.out.print("Nhap diem ly thuyet sinh vien 2: ");
        sv2.setDiemLyThuyet(sc.nextDouble());
        System.out.print("Nhap diem thuc hanh sinh vien 2: ");
        sv2.setDiemThucHanh(sc.nextDouble());

        Bai3_SinhVien sv3 = new Bai3_SinhVien();

        System.out.print("Nhap ma sinh vien 3: ");
        sv3.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ho ten sinh vien 3: ");
        sv3.setHoTen(sc.nextLine());
        System.out.print("Nhap diem ly thuyet sinh vien 3: ");
        sv3.setDiemLyThuyet(sc.nextDouble());
        System.out.print("Nhap diem thuc hanh sinh vien 3: ");
        sv3.setDiemThucHanh(sc.nextDouble());
        System.out.printf("%10s %15s %20s %15s %15s \n","Mã sinh viên","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");

        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
    }
}
