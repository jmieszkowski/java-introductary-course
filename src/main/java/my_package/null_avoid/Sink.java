package my_package.null_avoid;

public class Sink {
    private String label;


    public Sink(String label) {
        setLabel(label);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = validateLabel(label);
    }

    private String validateLabel(String label){
        if(null == label){
            throw new IllegalArgumentException("label cannot be null!!");
        }
        return label;
    }

    @Override
    public String toString() {
        return "Sink{" +
                "label='" + label + '\'' +
                '}';
    }
}
