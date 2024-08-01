package BaiTap_Collections;

import java.util.*;

public class Bai3_HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi van ban: ");
        String chuoiVanBan = sc.nextLine();
        String[] arr = chuoiVanBan.split(" ");
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<arr.length;i++){
            String key = arr[i];
            if(map.containsKey(key)){
                Integer value = map.get(key);
                map.remove(key);
                map.put(key,value+1);
            }else {
                map.put(key,1);
            }
        }

        Set set = map.keySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
          String  key=(String)i.next();
            System.out.println("tu '"+key+"' xuat hien "+map.get(key)+ " lan");
        }




    }
}
