package BaiTap_LapTrinhHuongDoiTuong;
 public class Bai1_Rectangle {
    private double chieuDai;
    private double chieuRong;

    public Bai1_Rectangle() {
    }

    public Bai1_Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double dienTich(){
        System.out.println("Dien tich hinh chu nhat la: ");
        return chieuDai*chieuRong;
    }
    public double chuVi() {
        System.out.println("Chu vi hinh chu nhat la: ");
        return (chieuDai+chieuRong)*2;
    }
}


