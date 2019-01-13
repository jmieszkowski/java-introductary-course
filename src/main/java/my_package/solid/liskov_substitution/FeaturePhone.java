package my_package.solid.liskov_substitution;

import java.util.Objects;

public class FeaturePhone {

    protected String model;

    public FeaturePhone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    protected boolean canBeEqual(){
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FeaturePhone)){
            return false;
        }
//        if (o == null || getClass() != o.getClass()) return false;
        FeaturePhone that = (FeaturePhone) o;

        if(!that.canBeEqual()){
            return false;
        }
        return Objects.equals(model, that.model);
    }


    @Override
    public String toString() {
        return "FeaturePhone{" +
                "model='" + model + '\'' +
                '}';
    }



}

