package my_package.solid.interface_segregation;

public class Engine {

    public void start(){
        System.out.println("start() from Engine");
    }

    public void stop(){
        System.out.println("stop() from Engine");
    }

    public void speedUp(){
        System.out.println("speedUP() from Engine");
    }

    public void slowDown(){
        System.out.println("slowDown() from Engine");
    }
}
