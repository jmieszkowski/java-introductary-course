package pl.com.empas.java_introductory_course.collections.tasks.task2_salaries;

import pl.com.empas.java_introductory_course.collections.common.Departament;
import pl.com.empas.java_introductory_course.collections.common.DepartamentGenerator;
import pl.com.empas.java_introductory_course.collections.common.Employee;

import java.util.List;
import java.util.Map;

public class Salaries {


    //Ta mapa zawiera jako klucze departamenty w firmie. Dla każdego departamentu,
    //zawiera listę pracowników. Każdy pracownik ma określoną pensję - salary. Możemy ją pobrać używając na pracowniku metody Employee.getSalary
    Map<Departament, List<Employee>> departamentMap = DepartamentGenerator.getDepartamentsWithEmployeesMap();

    /**
     * @param departament - departament to check
     * @return highest earning employee in a departament;
     */
    public Employee findBestEarningEmployee(Departament departament) {
        Employee maxSalary = new Employee(0, "", 0);
        for (Employee e : departamentMap.get(departament)) {
            if (e.getSalary() > maxSalary.getSalary()) {
                maxSalary = e;
            }
        }
        return maxSalary;
    }

    //Użyj poprzedniej metody!
    public Employee findBestEarningEmployee() {
        Employee bestEarningEmployee = new Employee(0, "", 0);
        for (Departament d : departamentMap.keySet()) {
            Employee candidate = findBestEarningEmployee(d);
            if(candidate.getSalary() > bestEarningEmployee.getSalary()) {
                bestEarningEmployee = candidate;
            }
        }
        return bestEarningEmployee;
    }

    public static void main(String[] args) {
        Salaries salaries = new Salaries();

        System.out.println("Best earning emloyee in all departaments: " + salaries.findBestEarningEmployee());
        for (Departament departament : DepartamentGenerator.getDepartaments()) {
            System.out.println("Best earning employee in departament " + departament.getName() + " is " + salaries.findBestEarningEmployee(departament));
        }
    }
}
