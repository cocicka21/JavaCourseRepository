package it.academy.course.hw17.Home17Task_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Home17Task_1 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.util.HashMap");
            System.out.println("Fields:");
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field : declaredFields) {
                System.out.println(field.getName() + " (" + field.getType().getSimpleName() + ")");
            }
            System.out.println("\nParent class:");
            Class<?> parent = clazz.getSuperclass();
            System.out.println(parent.getName());
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println(constructor.toString());
            }
            System.out.println("\nMethods:");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(method.getName());
            }
            System.out.println("\nInner classes:");
            Class<?>[] innerClasses = clazz.getDeclaredClasses();
            for (Class<?> innerClass : innerClasses) {
                System.out.println(innerClass.getName());
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
