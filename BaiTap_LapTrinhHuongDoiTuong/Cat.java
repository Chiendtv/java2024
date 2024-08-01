package BaiTap_LapTrinhHuongDoiTuong;

public class Cat extends Bai2_Animal {
    @Override
    public void eat() {
        System.out.println("meo an ca");
    }

    @Override
    public void makeSoud() {
        System.out.println("meo meo");

    }
    public void run(){
        System.out.println("Cat chay bang 4 chan");
    }
}
