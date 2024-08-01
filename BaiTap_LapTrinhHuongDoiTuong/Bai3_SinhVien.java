package BaiTap_LapTrinhHuongDoiTuong;

public class Bai3_SinhVien {
    private int id;
    private String hoTen;
    private double diemLyThuyet;
    private double diemThucHanh;

    public Bai3_SinhVien(int id, String hoTen, double diemLyThuyet, double diemThucHanh) {
        this.id = id;
        this.hoTen = hoTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public Bai3_SinhVien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(double diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(double diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }
    public double diemTB(){
        return (diemLyThuyet+diemThucHanh)/2;
    }
    @Override
    public String toString() {
        return id+ "   " + hoTen+ "   " + diemLyThuyet + "   " + diemThucHanh+ "   " +diemTB();
    }
    public void inSV() {
        System.out.printf("%10s %15s %20s %15s %15s \n", id, hoTen, diemLyThuyet, diemThucHanh, diemTB());
    }


}
