package pl.com.empas.java_introductory_course.generics.converters;

public interface ConverterContract<FROM, TO> {

    TO convert(FROM value);
}
