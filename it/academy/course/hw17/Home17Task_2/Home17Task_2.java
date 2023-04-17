package it.academy.course.hw17.Home17Task_2;

import java.lang.reflect.Method;

public class Home17Task_2 {
    public static void main(String[] args) {
        Academy academy = new Academy();
        Method[] allMethods = academy.getClass().getDeclaredMethods();
        for (Method method : allMethods) {
            if (method.isAnnotationPresent(AcademyInfo.class)) {
                AcademyInfo annotation = method.getAnnotation(AcademyInfo.class);
                if (annotation.year() != 0) {
                    System.out.println(method.getName() + " is marked with @AcademyInfo and has year " + annotation.year());
                } else {
                    System.out.println(method.getName() + " is marked with @AcademyInfo but has no year");
                }
            } else {
                System.out.println(method.getName() + " is not marked with @AcademyInfo");
            }
        }
    }
}
