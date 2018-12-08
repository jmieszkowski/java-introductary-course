package constructor;

public class Cutlet {

    private Cutlet(){
        System.out.println("Cutlet");
    }
    private Cutlet(String addon){
        System.out.println("Cutlet with addon: " + addon);
    }

    public static Cutlet giveMeNormalCutlet(){ //metoda fabryczna - tworzy obiekt
        return new Cutlet();
    }

    public static Cutlet giveMeCutletWithAddon(String addon){
        return new Cutlet(addon);
    }


}
