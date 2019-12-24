package com.review;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 主要验证集合两个自定义比较器的使用
 * Comparable  实体类实现该抽象接口Comparable，重写compareTo方法
 * Comparator  用匿名内部类来实现comprare方法
 */
public class CollCompReview {
    public static void main(String args[]){

        //验证匿名内部类的比较器方式Comparator
        TreeSet<Student1> treeSet = new TreeSet<Student1>(new Comparator<Student1>(){

            @Override
            public int compare(Student1 o1, Student1 o2) {
                int num1 = o1.getAge()-o2.getAge();
                int num2 = num1==0? o1.getName().compareTo(o2.getName()):num1;
                return num2;
            }
        });

        treeSet.add(new Student1(18,"zhangsan"));
        treeSet.add(new Student1(18,"lisi"));
        treeSet.add(new Student1(18,"wangwu"));

        for (Student1 s:treeSet) {
            System.out.println(s.getAge()+":"+s.getName());
        }
    }
}
