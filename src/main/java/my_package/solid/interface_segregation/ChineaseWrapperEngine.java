package my_package.solid.interface_segregation;

public class ChineaseWrapperEngine implements RunEngine {

    private ChineaseEngine  chineaseEngine;


    public ChineaseWrapperEngine(ChineaseEngine chineaseEngine) {
        this.chineaseEngine = chineaseEngine;
    }

    @Override
    public void start() {
            chineaseEngine.safasfa();
    }

    @Override
    public void stop() {
            chineaseEngine.safhahhhh();
    }
}
