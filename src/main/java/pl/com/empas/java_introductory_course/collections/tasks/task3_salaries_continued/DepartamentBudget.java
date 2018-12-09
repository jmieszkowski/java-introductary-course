package pl.com.empas.java_introductory_course.collections.tasks.task3_salaries_continued;

import pl.com.empas.java_introductory_course.collections.common.Departament;
import pl.com.empas.java_introductory_course.collections.common.DepartamentGenerator;
import pl.com.empas.java_introductory_course.collections.common.Employee;
import pl.com.empas.java_introductory_course.collections.common.OrderedPair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartamentBudget {

    Map<Departament, List<Employee>> departaments = DepartamentGenerator.getDepartamentsWithEmployeesMap();


    public List<Departament> getBudgetViolatingDepartaments() {
        return this.getBudgetViolationsWithAmounts().stream().map(OrderedPair::getVal1).collect(Collectors.toList());
    }

    public List<OrderedPair<Departament, Long>> getBudgetViolationsWithAmounts() {
        List<OrderedPair<Departament, Long>> retVal = new ArrayList<>();
        for(Departament d: departaments.keySet()) {
            long salariesCombined = 0;
            for(Employee e : departaments.get(d)) {
                salariesCombined += e.getSalary();
            }
            if(salariesCombined > d.getBudget()) {
                retVal.add(new OrderedPair<>(d, salariesCombined - d.getBudget()));
            }
        }
        return retVal;
    }

    public static void main(String [] args) {
        DepartamentBudget budget = new DepartamentBudget();
        List<Departament> budgetViolations = budget.getBudgetViolatingDepartaments();
        System.out.println(budgetViolations);

        //Dla chętnych
        List<OrderedPair<Departament, Long>> budgetViolationsWithAmounts = budget.getBudgetViolationsWithAmounts();
        System.out.println(budgetViolationsWithAmounts);
    }
}
