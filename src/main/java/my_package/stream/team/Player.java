package my_package.stream.team;

import java.math.BigDecimal;


public class Player {
    private String nick;
    private long skill;
    private BigDecimal income;


    public Player(String nick, long skill, BigDecimal income) {
        this.nick = nick;
        this.skill = skill;
        this.income = income;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public long getSkill() {
        return skill;
    }

    public void setSkill(long skill) {
        this.skill = skill;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nick='" + nick + '\'' +
                ", skill=" + skill +
                ", income=" + income +
                '}';
    }

}
