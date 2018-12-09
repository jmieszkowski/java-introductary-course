package pl.com.empas.java_introductory_course.collections;

import pl.com.empas.java_introductory_course.collections.common.Employee;
import pl.com.empas.java_introductory_course.generics.converters.ConverterContract;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeListToMapConverter implements
        ConverterContract<List<? extends Employee>, Map<String, ? extends Employee>> {
    @Override
    public Map<String, ? extends Employee> convert(List<? extends Employee> value) {
        Map<String, Employee> map = new HashMap<>();
        for(Employee elem : value) {
            map.put(elem.getEmployeeId(), elem);
        }
        return map;
    }
}
