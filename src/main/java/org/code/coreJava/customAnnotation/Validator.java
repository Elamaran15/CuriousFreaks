package org.code.coreJava.customAnnotation;

import org.code.coreJava.sealed.ClassC;
import org.code.week5.arrays.Sort0s1sand2s;

import java.lang.reflect.Field;

public class Validator {

    public static void isValid(Object object) throws IllegalAccessException {
        Class<?> clazz=object.getClass();

        for(Field field:clazz.getDeclaredFields()){
            if(field.isAnnotationPresent(IsAgeValid.class)){
                field.setAccessible(true);
                IsAgeValid valid=field.getAnnotation(IsAgeValid.class);
                int value = (int) field.get(object);
                if(value>50){
                    System.out.println(valid.message());;
                }
            }
        }

    }
}
