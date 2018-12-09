package my_package.continent;

public class Europe extends Continent {


    public Europe(){
        this("Poland");
    }
    public Europe(String country){
        super(country);
        System.out.println("Country of Europe: " + country);
    }
    static{
        System.out.println("Europe - first static block");
    }
    static {
        System.out.println("Europe - second static block");
    }
    {
        System.out.println("Europe - first init block");
    }
    {
        System.out.println("Europe - second init block");
    }
}
