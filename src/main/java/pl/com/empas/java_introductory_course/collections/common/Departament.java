package pl.com.empas.java_introductory_course.collections.common;

public class Departament {

    public Departament(String name, Long budget) {
        this.name = name;
        this.budget = budget;
    }

    private final String name;

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    private Long budget;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Departament that = (Departament) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return budget != null ? budget.equals(that.budget) : that.budget == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (budget != null ? budget.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                '}';
    }

    public String getName() {
        return name;
    }

    public Long getBudget() {
        return budget;
    }
}
