package my_package.null_avoid.football;

public class FootballClub {
    private Stadium stadion;


    public FootballClub(Stadium stadion) {
        this.stadion = stadion;
    }

    public Stadium getStadion() {
        return stadion;
    }

    public void setStadion(Stadium stadion) {
        this.stadion = stadion;
    }

    @Override
    public String toString() {
        return "FootballClub{" +
                "stadion=" + stadion +
                '}';
    }
}
