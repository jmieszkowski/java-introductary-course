package pl.com.empas.java_introductory_course.java8.avoid_null;

public class Chipset {
    private String vendror;

    public Chipset(String vendror) {

        this.vendror = vendror;
    }

    @Override
    public String toString() {
        return "Chipset{" +
                "vendor='" + vendror + '\'' +
                '}';
    }

    public String getVendror() {
        return vendror;
    }

    public void setVendror(String vendror) {
        this.vendror = vendror;
    }
}
