package my_package.stream.homework_stream;

public class Ingredients {
    private boolean containsNuts;
    private boolean containsSugar;
    private boolean containsCoffeine;

    public Ingredients(boolean containsNuts, boolean containsSugar, boolean containsCoffeine) {
        this.containsNuts = containsNuts;
        this.containsSugar = containsSugar;
        this.containsCoffeine = containsCoffeine;
    }

    public boolean isContainsNuts() {
        return containsNuts;
    }

    public void setContainsNuts(boolean containsNuts) {
        this.containsNuts = containsNuts;
    }

    public boolean isContainsSugar() {
        return containsSugar;
    }

    public void setContainsSugar(boolean containsSugar) {
        this.containsSugar = containsSugar;
    }

    public boolean isContainsCoffeine() {
        return containsCoffeine;
    }

    public void setContainsCoffeine(boolean containsCoffeine) {
        this.containsCoffeine = containsCoffeine;
    }
}
