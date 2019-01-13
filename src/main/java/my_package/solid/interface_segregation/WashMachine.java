package my_package.solid.interface_segregation;

public class WashMachine {

    private RunEngine engine;


    public WashMachine(RunEngine engine) {
        this.engine = engine;
    }

    public void beginWash(){
        System.out.println("beginWash()");
        engine.start();
    }

    public void endWash(){
        System.out.println("endWash()");
        engine.stop();
    }
}
