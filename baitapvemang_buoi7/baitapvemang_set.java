package baitapvemang_buoi7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class baitapvemang_set {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong pt cua mang: ");
        int n = sc.nextInt();
        for(int i=0; i<n;i++) {
            System.out.print("Nhap pt thu " + (i + 1) + " : ");
            int j = new Scanner(System.in).nextInt();
            set1.add(j);
        }
        System.out.println("Mang duoc tao la: ");
        System.out.println(set1);
        //set không chứa các phần tử giống nhau nên  không dùng để nhập mảng được. theo em nghĩ là vậy!
        //map dùng để lưu trữ và truy xuất dữ liệu theo cặp key và value. nên e nghĩ với bài này cũng không làm được.
    }
}
