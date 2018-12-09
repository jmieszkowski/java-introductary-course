package pl.com.empas.java_introductory_course.generics.validators;


import pl.com.empas.java_introductory_course.oop.solid.common.XmlDocument;

public interface Validator<T extends Number> {

    boolean validate(T value);

}

