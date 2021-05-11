package com.felix.refelction;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Felix
 * @date 2021/5/9 8:09 上午
 * @DESC
 */
public class TargetObject {


    private String value;

    public TargetObject() {
        value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("Value  is " + value);
    }


    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException, InstantiationException, ClassNotFoundException {

        Class<?> targetClass = Class.forName("com.felix.refelction.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance();

        Method[] methods = targetClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }


        Method publicMethod = targetClass.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(targetObject, "FELIXX");

        Field field = targetClass.getDeclaredField("value");
        field.setAccessible(true);
        field.set(targetObject, "Fleixx");

        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }



}
