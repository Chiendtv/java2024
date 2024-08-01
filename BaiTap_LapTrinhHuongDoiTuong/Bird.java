package BaiTap_LapTrinhHuongDoiTuong;

public class Bird extends Bai2_Animal {
    @Override
    public void eat() {
        System.out.println("chim an thoc");
    }

    @Override
    public void makeSoud() {
        System.out.println("chim hot niu no");

    }
    public void fly(){
        System.out.println("chim bay bang doi canh");
    }
}
