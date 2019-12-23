package com.review;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 验证set值是否重复的问题
 *
 * 6、Set里面的元素不能重复，用什么方法区分重复与否。
 * 百度解释   equals就可以区分
 * 验证过程   重写hasCode和equals方法可以推翻
 *
 * 结论
 * 判断set的对象是否相同，取决于插入Set的对象是否重写了equals和hashcode方法，如果两者相同就是相同对象，不同就是不同对象
 */
public class SetReview {
    public static void main(String args[]){
        Set<String> set1 = new HashSet<String>();
        System.out.println(set1.add("zhangsan"));//true
        System.out.println(set1.add("lisi"));//true
        System.out.println(set1.add("zhangsan"));//false

        //遍历set集合   迭代器
        for (Iterator iterator = set1.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }

        System.out.println("====================分割线========================");

        Set<People> set2 = new HashSet<People>();
        System.out.println(set2.add(new People("zhangsan")));//true
        System.out.println(set2.add(new People("lisi")));//true
        System.out.println(set2.add(new People("zhangsan")));//true

        for (Iterator<People> iterator = set2.iterator();iterator.hasNext();){
            System.out.println(iterator.next().getName());
        }

        System.out.println("=======分割线===对象重写equals和hashCode后==========");

        Set<People1> set3 = new HashSet<People1>();
        System.out.println(set3.add(new People1("zhangsan")));//true
        System.out.println(set3.add(new People1("lisi")));//true
        System.out.println(set3.add(new People1("zhangsan")));//false

        for (Iterator<People1> iterator = set3.iterator();iterator.hasNext();){
            System.out.println(iterator.next().getName());
        }

        /**
         * 综上：
         * java里面的Set完全反映 到数学集合上的意义。java里面的Set里面的元素也是不运行重复的。
         * 在上述代码中有两个zhangsan，是重复的。既然是重复的，你添加完一个再去添加另外一 个相同的元素，是不能添加进去的
         *
         * Set集合不是采用普通的集合遍历去确认一个值是否在集合中重复而是采用了Hash的方式。HashSet的存储机制：Hash是散列，
         * 它是这样比较的，当往集合里面 增加一个对象的时候，我们是把对象的引用(对象的内存地址)增加到集合里面去了，当把对象
         * 的引用增加到集合里面去后，集合要做什么呢？它首先读取增加对象的hashCode (调用对象的hashCode()方法,hashCode()
         * 方法在在Object类里面定义的)，根据hashCode，集合去计算存放对象的位置，当这个位置没有存放对象的话，集合就认为
         * 这个对象没有重复，直接就存放这个对象，这是第一种情况。第二种情况，首先它还是要计算 hashCode,得到hash码，同样
         * 还是要计算位置，当它计算出位置时，发现这个位置已经有这个对象存在了，它并不会立刻告知增加不成功，它会接着调 用
         * 你增加这个对象的equals方法跟已经在位置上存在的对象进行比较，如果equals方法返回true,表示这两个对象的内容是一样
         * 的，既然对象的内 容是一样，集合就认为这个对象已经在集合里面存在了，就增加不进去了。集合的add方法返回一个false。
         * 如果equals方法返回false,表示将 要增加的对象和集合里面已经存在的对象的内容不一样，既然内容不一样，集合就再去散
         * 列一次，计算出新的地址，把你这个对象放到新的地址上去,还是会增加成功。
         */


        /**
         * 总 结:
         * 1、当向集合Set中增加对象时，首先集合计算要增加对象的hashCode码，根据该值来得到一个位置用来存放当前对象，挡在该
         * 位置没有一个对象存 在的话，那么集合Set认为该对象在集合中不存在，直接增加进去。如果在该位置有一个对象存在的话，接
         * 着将准备增加到集合中的对象与该位置上的对象进行 equals方法比较，如果该equals方法返回false,那么集合认为集合中不
         * 存在该对象，在进行一次散列，将该对象放到散列后计算出的新地址里， 如果equals方法返回true，那么集合认为集合中已
         * 经存在该对象了，不会再将该对象增加到集合中了。
         * 2、重写equals方法的时候必须重写hashCode方法。如果一个类的两个对象，使用equals方法比较时，结果为true,那么
         * 该两个对象具有 相同的hashCode。原因是equals方法为true,表明是同一个对象，它们的hashCode当然相同。
         * 3、Ojbect类的hashCode方法返回的是Object对象的内存地址。我们可以通过Integer.toHexString(new Object().hashCode);来得到
         */
    }
}
