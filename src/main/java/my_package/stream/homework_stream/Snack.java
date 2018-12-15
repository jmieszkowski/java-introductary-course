package my_package.stream.homework_stream;

public class Snack {
    private Chips chips;
    private Nuggets nuggets;
    private Popcorn popcorn;

    public Snack(Chips chips, Nuggets nuggets, Popcorn popcorn) {
        this.chips = chips;
        this.nuggets = nuggets;
        this.popcorn = popcorn;
    }

    public Chips getChips() {
        return chips;
    }

    public void setChips(Chips chips) {
        this.chips = chips;
    }

    public Nuggets getNuggets() {
        return nuggets;
    }

    public void setNuggets(Nuggets nuggets) {
        this.nuggets = nuggets;
    }

    public Popcorn getPopcorn() {
        return popcorn;
    }

    public void setPopcorn(Popcorn popcorn) {
        this.popcorn = popcorn;
    }
}
