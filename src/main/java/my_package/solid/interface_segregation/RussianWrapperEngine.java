package my_package.solid.interface_segregation;

public class RussianWrapperEngine implements RunEngine {

    private RussianEngine russianEngine;

    public RussianWrapperEngine(RussianEngine russianEngine) {
        this.russianEngine = russianEngine;
    }

    @Override
    public void start() {
        russianEngine.dawaj();
    }

    @Override
    public void stop() {
        russianEngine.dawaj();
        russianEngine.dawaj();
    }
}
