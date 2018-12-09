package pl.com.empas.java_introductory_course.java8.avoid_null_flatmap;

import java.util.Optional;

public class Chipset {
    private String vendorName = "nVidia";

    @Override
    public String toString() {
        return "Chipset{" +
                "vendorName='" + vendorName + '\'' +
                '}';
    }

    public Optional<String> getVendorName() {
        return Optional.ofNullable(vendorName);
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Chipset(String vendorName) {

        this.vendorName = vendorName;
    }
}
