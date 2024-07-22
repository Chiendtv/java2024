package baitapvemang_buoi7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class baitapvemang_list {
    public static void main(String[] args) {
        // yêu cầu thêm: làm thêm 1 cách nữa bằng list, Set, Map.
        // list
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cho mang: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for(int i=0; i<n;i++){
            System.out.print("Nhap pt thu "+(i+1)+" : ");
         int j = new Scanner(System.in).nextInt();
           list.add(j);
        }
        System.out.println("Mang duoc tao la: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("gia tri nho nhat trong mang: "+list.get(0));
        System.out.println("gia tri lon nhat trong mang: "+list.get(n-1));
        int tong = 0;
        for(int i=0; i<n; i++){
            tong+=list.get(i);
        }
        System.out.println("tong cua cac pt trong mang la: "+tong);
        System.out.println("gia tri trung binh cac pt trong mang: "+(double)tong/n);
        int soChan = 0;
        for(int i=0;i<n; i++){
            if(list.get(i)%2==0){
                soChan+=1;
            }
        }
        System.out.println("so luong cac so chan la: "+soChan);
        System.out.println("so luong cac so le la: "+(n-soChan));




    }
}
