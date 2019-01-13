package my_package.garbage_collector;

import java.util.Objects;

public class FeaturePhone {

    private String model;

    public FeaturePhone(String model) {
        this.model = model;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeaturePhone that = (FeaturePhone) o;
        return Objects.equals(model, that.model);
    }


    @Override
    public String toString() {
        return "FeaturePhone{" +
                "model='" + model + '\'' +
                '}';
    }



}

