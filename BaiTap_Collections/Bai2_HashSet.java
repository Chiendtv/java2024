package BaiTap_Collections;

import java.util.HashSet;
import java.util.Set;

public class Bai2_HashSet {
    public static void main(String[] args) {
        int[] soNguyen = {1,2,3,5,6,5,4,5,3};
        Set set = new HashSet();
       for(int i=0;i<soNguyen.length;i++){
           set.add(soNguyen[i]);
       }
        System.out.println(set);

    }
}
