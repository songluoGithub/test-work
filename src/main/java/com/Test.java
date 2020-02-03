package com;

public class Test {
    public static void main(String[] args){
        String a = "a";
        String c = a.concat("b");
        String b = "ab";
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        if (c == b){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }
}
