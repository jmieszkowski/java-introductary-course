package my_package.null_avoid.football_with_optional;

public class FootballClub {
    private Stadium stadium;


    public FootballClub(Stadium stadium) {
        this.stadium = validate(stadium);
    }

    public Stadium getStadium() {
        validate(stadium);
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = validate(stadium);
    }

    private Stadium validate(Stadium stadium){
        if (null == stadium){
            throw new IllegalArgumentException("Stadium cannot be null!");
        }

        return stadium;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "stadium=" + stadium +
                '}';
    }
}
