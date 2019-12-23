package com.review;

import java.util.Objects;

/**
 *set集合值不能重复测试
 */
public class People1 {
    private String name;

    public People1(){

    }

    public People1(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    public boolean equals(Object obj) {
        return super.equals(obj);
    }*/

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (obj instanceof People1)
            if (Objects.equals(name,((People1) obj).name)) return true;
        return false;
    }

/*    public int hashCode() {
        return super.hashCode();
    }*/

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name);
    }*/
}
