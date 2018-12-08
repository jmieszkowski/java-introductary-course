package constructor;

public class Dish {

    private String kind;

    static{
        System.out.println("First dish static class initialization");
    }
    public Dish(){
        this(" pasta");
        System.out.println("Dish()");
    }


    // overloading - wielokrotne wykorszystanie tej samej nazwy, ale z jakimś wyróżnikiem.
    public Dish(String kind){
        System.out.println("Dish() " + kind);
        this.kind = kind;
    }


    {
        System.out.println("First init block");
    }

    static { //blok statyczny inicjalizujący
        System.out.println("Second dish static class initialization");
    }
    { // blok niestatyczny

        System.out.println("Second init block");

    }

    static{
        System.out.println("Dish - static dish class initalization");
    }

}
