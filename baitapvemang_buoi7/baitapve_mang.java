package baitapvemang_buoi7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class baitapve_mang {
    //Viết một ct java để thực hiện:
    // Nhập vào 1 mảng số nguyên.
    // Tìm giá trị  lớn nhất,nhỏ nhât trong mảng.
    // Tính và in ra tổng các phần tử trong mảng.
    // Tính và in ra giá trị trung bình của các pt trong mảng.
    // Đếm và in ra số lượng các số chẵn và số lẻ trong mảng
    // yêu cầu thêm: làm thêm 1 cách nữa bằng list, Set, Map.
    public static void main(String[] args) {
        //1. Nhập vào 1 mảng số nguyên.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu: "+(i+1));
            mang[i] = sc.nextInt();

        }
        System.out.println("Mang duoc tao la: ");
        System.out.println(Arrays.toString(mang));

        // Tìm giá trị  lớn nhất,nhỏ nhât trong mảng.
        Arrays.sort(mang);
        System.out.println("Gia tri nho nhat cua mang la: "+mang[0]);
        System.out.println("Gia tri lon nha cua mang la : "+mang[n-1]);

        // Tính và in ra tổng các phần tử trong mảng.
        int tong = 0;
        for(int i=0; i<n; i++){
            tong+=mang[i];

        }
        System.out.println("Tong cua cac phan tu trong mang la: "+tong);

        // Tính và in ra giá trị trung bình của các pt trong mảng.

        System.out.println("Gia tri trung binh phan tu trong mang la: "+ (double)tong/n);

        // Đếm và in ra số lượng các số chẵn và số lẻ trong mảng

        int demSoChan = 0;
        int demSoLe = 0;
        for(int i=0; i<n; i++){
            if(mang[i]%2==0) {
                demSoChan+= 1;
            }
            else {
            demSoLe+=1;
            }

        }
        System.out.println("Mang co so luong so chan la: "+demSoChan);
        System.out.println("Mang co so luong so le la: "+demSoLe);


    }
}
