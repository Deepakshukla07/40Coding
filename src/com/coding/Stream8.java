package com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Stream8 {

    public void streamMethod() {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1,"deepak");
        hashMap.put(2,"shukla");
        hashMap.put(3,"shaikhu");
        hashMap.put(4,"ayesha");
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list.stream().map(x->x*3).filter(x->x>7).reduce(0,(ans,i)->ans+i));

    }
}
