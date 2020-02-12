package com.study.java;

import java.util.HashMap;

/**
 * @author lk
 * @date 2020/2/12 - 9:59
 */
public class debug {

    public static void main(String[] args) {


        HashMap<String,String> map=new HashMap<>();

         map.put("name","Tom");
        map.put("age","19");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);



    }
}
