package com.java.advanced;

import java.lang.reflect.Method;
import java.util.Set;
import java.util.TreeSet;

public class JavaReflectionAttributes {

    public static void main(String[] args) {
        Method[] methods = Student.class.getDeclaredMethods();
        Set orderedMethodsNames = new TreeSet<String>();

        for (Method method : methods) {
            orderedMethodsNames.add(method.getName());
        }

        orderedMethodsNames.forEach(method -> System.out.println(method));
    }

}

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
 }