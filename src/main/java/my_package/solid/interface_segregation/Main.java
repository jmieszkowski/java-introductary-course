package my_package.solid.interface_segregation;

public class Main {
    public static void main(String[] args) {
        WashMachine washMachine = new WashMachine(new PolishEngine(new Engine()));

        WashMachine washMachine2 = new WashMachine(new ChineaseWrapperEngine(new ChineaseEngine()));

        WashMachine washMachine3 = new WashMachine(new IndianWrapperEngine(new IndianEngine()));

        WashMachine washMachine4 = new WashMachine(new RussianWrapperEngine(new RussianEngine()));


        washMachine.beginWash();

        washMachine2.beginWash();
        washMachine3.beginWash();
        washMachine4.beginWash();

        

    }
}
