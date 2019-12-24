package com.review.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.MessageFormat;

/**
 * 反射逻辑封装类
 */
public class ReflectClass {
    private final static String TAG = "com.review.reflection";

    //创建对象  正常创建通过get set方式赋值
    public static void reflectNewInstance(){
        try {
            //forName根据类名返回类的对象
            Class<?> classBook = Class.forName("com.review.reflection.Book");
            //newInstance创建类得实例
            //说明  没有子父类的情况则对象可以为实例  如果出现子父类Person person = new Child();    Child对象应该是Person类的一个实例，实例是对象实例化后的结果
            Object objectBook = classBook.newInstance();
            Book book = (Book) objectBook;
            book.setName("java进阶");
            book.setAuthor("某某");
            System.out.println(book.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //反射私有的构造方法
    public static void reflectPrivateConstructor(){
        try {
            Class<?> classBook = Class.forName("com.review.reflection.Book");
            //获得该类中与参数类型匹配的构造方法
            //String.class  获取Class类型的对象
            Constructor<?> declaredConstructorBook = classBook.getDeclaredConstructor(String.class,String.class);
            declaredConstructorBook.setAccessible(true);//访问类中成员属性为private时必须加入的操作
            Object objectBook = declaredConstructorBook.newInstance("Java高级进阶","高某");
            Book book = (Book)objectBook;
            System.out.println(book.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //反射私有属性
    public static void reflectPrivateField(){
        try {
            Class<?> classBook = Class.forName("com.review.reflection.Book");
            Object object = classBook.newInstance();
            //获得某个属性对象   getField获取某个公有属性
            Field field = classBook.getDeclaredField("TAG");
            field.setAccessible(true);
            //get 方法返回指定对象上由此Field表示的字段的值。如果该对象具有原始类型，则该值将自动包装在对象中。
            String tag = (String) field.get(object);
            System.out.println(tag);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //反射私有方法
    public static void reflectPrivateMethod(){
        try {
            Class<?> classBook = Class.forName("com.review.reflection.Book");
            Method method = classBook.getDeclaredMethod("declaredMethod",int.class);
            method.setAccessible(true);
            Object object = classBook.newInstance();
            //invoke传递object对象及参数调用该对象对应的方法
            String string = (String) method.invoke(object,2);
            System.out.print(string);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        //reflectNewInstance();
        //reflectPrivateConstructor();
        //reflectPrivateField();
        reflectPrivateMethod();
    }
}

