package my_package.solid.open_close_principle;

public class BetterSecret {
    private final String mySecret;
    private Saver<BetterSecret> secretSaver;

    public BetterSecret(String mySecret, Saver<BetterSecret> secretSaver) {
        this.mySecret = mySecret;
        this.secretSaver = secretSaver;
    }

    public String getMySecret() {
        return mySecret;
    }

    public Saver getSecretSaver() {
        return secretSaver;
    }

    public void setSecretSaver(Saver<BetterSecret> secretSaver) {
        this.secretSaver = secretSaver;
    }

    public void save(){
        secretSaver.save(this);
    }


    @Override
    public String toString() {
        return "BetterSecret{" +
                "mySecret='" + mySecret + '\'' +
                ", secretSaver=" + secretSaver +
                '}';
    }
}
