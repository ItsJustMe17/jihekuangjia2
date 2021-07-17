package com.Collection.CollentionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> c=new ArrayList<Student>();
        Student s1=new Student("林黛玉",30);
        Student s2=new Student("冯小刚",30);
        Student s3=new Student("马化腾",30);
        c.add(s1);
        c.add(s2);
        c.add(s3);
        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student next = it.next();
            System.out.println(next.getName()+","+next.getAge());
        }
    }
}
