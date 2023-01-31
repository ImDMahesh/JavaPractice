package com.cam.bean.java8streams;

import java.util.*;

public class Employee {
    public static void main(String[] args) {
        List<EmployeeBean> al = new ArrayList<>();
        al.add(new EmployeeBean(123, "Bharath"));
        al.add(new EmployeeBean(121, "Dasarath"));
        al.add(new EmployeeBean(122, "Ram"));
        al.add(new EmployeeBean(124, "Lakshman"));
        al.add(new EmployeeBean(125, "Satrugna"));
        al.stream().forEach(e->System.out.println(e));
        System.out.println();
        Comparator<EmployeeBean> sortById = (e1, e2)->(e1.eId<e2.eId)?-1:(e1.eId>e2.eId)?1:0;
        Collections.sort(al, sortById);
        al.stream().forEach(System.out::println);
        System.out.println();
        Comparator<EmployeeBean> sortByName = (e1, e2)->(e1.eName.compareTo(e2.eName));
        Collections.sort(al, sortByName);
        al.stream().forEach(System.out::println);
        System.out.println();

        //Tree Map
        TreeSet<EmployeeBean> tSet = new TreeSet<>((e1, e2)->(e1.eId>e2.eId)?-1:(e1.eId<e2.eId)?1:0);
        tSet.add(new EmployeeBean(123, "Bharath"));
        tSet.add(new EmployeeBean(121, "Dasarath"));
        tSet.add(new EmployeeBean(122, "Ram"));
        tSet.add(new EmployeeBean(125, "Satrugna"));
        tSet.add(new EmployeeBean(124, "Lakshman"));
        System.out.println("TreeSet");
        tSet.stream().forEach(e->System.out.println(e));
    }
}