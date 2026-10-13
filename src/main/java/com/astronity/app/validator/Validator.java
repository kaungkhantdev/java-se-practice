package com.astronity.app.validator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Validator {
    void validate(Object obj)
    {
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
//            System.out.println("Field: " + field.getName());
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
//                System.out.println(annotation.annotationType().getName());
                if (annotation instanceof NullOrEmpty) {
                    NullOrEmpty nullOrEmpty = (NullOrEmpty) annotation;
                    String value;
                    try {
                        value = (String) (field.get(obj));
                        if (value == null || value == "") {
                            System.out.println("Field " + field.getName() + " " + nullOrEmpty.message());
                        }
                    } catch (IllegalArgumentException ex) {
                        Logger.getLogger(Validator.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(Validator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

    }
}
