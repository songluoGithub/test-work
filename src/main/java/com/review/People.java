package com.review;

import java.util.Objects;

/**
 *set集合值不能重复测试
 */
public class People {
    private String name;

    public People(){

    }

    public People(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
