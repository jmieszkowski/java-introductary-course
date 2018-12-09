package my_package.continent;

public class Continent {
    private String country;
    public Continent(){
    }

    public Continent(String country){

        this.country = country;
        System.out.println("Country: " + country);

    }

    static{
        System.out.println("Continent - first static block");
    }
    {
        System.out.println("Continent - first init block");
    }
}
