package constructor;

public class Pizza extends Dish{

    static {
        System.out.println("Pizza - static block");
    }

    {
        System.out.println("Pizza - instance block");
    }
    public Pizza(){
        this("ham");
        System.out.println("Pizza()");
    }
    public Pizza(String addons){
        super(addons);
        System.out.println("Pizza with addons: " + addons);
    }


}
