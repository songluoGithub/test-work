package com.review;

/**
 * 内置比较器
 */
public class Student implements Comparable<Student>{
    private int age;
    private String name;

    public Student(){

    }

    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        int num1 = this.age-o.age;

        int num2= num1==0? this.name.compareTo(o.name):num1;

        return num2;
    }
}
