package my_package.continent;


public class Asia extends Continent{
    public Asia(){
        this("China");

    }
    public Asia(String country){
        System.out.println("Country of Asia: " + country);
    }

    static{
        System.out.println("Asia - first static block");
    }
    static{
        System.out.println("Asia - second static block");
    }
    {
        System.out.println("Asia - first init block");
    }
    {
        System.out.println("Asia - second init block");
    }
}
