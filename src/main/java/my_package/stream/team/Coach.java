package my_package.stream.team;

import java.math.BigDecimal;

public class Coach {
    private String name;
    private String surname;
    private BigDecimal income;

    public Coach(String name, String surname, BigDecimal income) {
        this.name = name;
        this.surname = surname;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", income=" + income +
                '}';
    }
}
