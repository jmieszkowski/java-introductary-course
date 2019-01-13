package my_package.solid.interface_segregation;

public class PolishEngine implements RunEngine{

    private Engine engine;

    public PolishEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public void start() {
        System.out.println("start() from PolishEngine");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println("stop() from PolishEngine");
        engine.stop();
    }
}
