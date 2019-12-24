package com.review.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射逻辑封装类,自己理解
 */
public class ReflectDemo {
    private final static String TAG = "com.review.reflection";

    //创建对象  正常创建通过get set方式赋值
    public static void reflectNewInstance(){
        try {
            //获取对象
            Class<?> instaceObject = Class.forName("com.review.reflection.Book");
            //获取实例
            Object object = instaceObject.newInstance();

            Book book = (Book) object;

            book.setName("Java进阶教程大纲");
            book.setAuthor("罗松");

            System.out.println(book.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //反射私有的构造方法
    public static void reflectPrivateConstructor(){
        try {
            //获取根据名字对象
            Class<?> constructorObj = Class.forName("com.review.reflection.Book");
            //根据对象获取构造
            Constructor constructor = constructorObj.getDeclaredConstructor(String.class,String.class);
            //获取私有属性，设置
            constructor.setAccessible(true);
            //获取对象实例
            Object object = constructor.newInstance("java基础","张三");
            Book book = (Book) object;
            //打印
            System.out.println(book.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //反射私有属性
    public static void reflectPrivateField(){
        try {
            Class<?> privateField = Class.forName("com.review.reflection.Book");
            Object object = privateField.newInstance();
            Field field = privateField.getDeclaredField("TAG");
            field.setAccessible(true);
            Object object1 = field.get(object);
            System.out.println(object1.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //反射私有方法
    public static void reflectPrivateMethod(){
        try {
            Class<?> privateMethod = Class.forName("com.review.reflection.Book");
            Object object = privateMethod.newInstance();
            Method method = privateMethod.getDeclaredMethod("declaredMethod",int.class);
            method.setAccessible(true);
            Object o = method.invoke(object,4);
            System.out.println(o.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        reflectPrivateMethod();
    }
}

