package my_package.solid.interface_segregation;

public class IndianWrapperEngine implements RunEngine{
    private IndianEngine indianEngine;

    public IndianWrapperEngine(IndianEngine indianEngine) {
        this.indianEngine = indianEngine;
    }

    @Override
    public void start() {
        indianEngine.h1();
        indianEngine.h2();
    }

    @Override
    public void stop() {
        indianEngine.h5();
        indianEngine.h7();
    }
}
