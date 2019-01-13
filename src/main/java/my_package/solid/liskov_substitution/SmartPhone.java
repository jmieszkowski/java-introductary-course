package my_package.solid.liskov_substitution;

import java.util.Objects;

public class SmartPhone extends FeaturePhone {

    public SmartPhone(String model) {
        super(model);
    }

    @Override
    public String getModel(){
        return "Smartphone: " + super.getModel();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmartPhone)){
            return false;
        }
//        if (o == null || getClass() != o.getClass()) return false;
        FeaturePhone that = (SmartPhone) o;
        return Objects.equals(model, that.model);
    }
}
