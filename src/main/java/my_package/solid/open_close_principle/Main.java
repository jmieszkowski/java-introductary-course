package my_package.solid.open_close_principle;

public class Main {
    public static void main(String[] args) {
        Secret secret = new Secret("secret", "/home/arch/secret.txt");
        secret.save();

        Saver<BetterSecret> fileSaver = new FileSaver();
        Saver<BetterSecret> databaseSaver = new DatabaseSaver();
        Saver<BetterSecret> cloudSaver = new CloudSaver();

        BetterSecret betterSecret = new BetterSecret("Secret", fileSaver);
        betterSecret.save();

        betterSecret.setSecretSaver(databaseSaver);
        betterSecret.save();

        betterSecret.setSecretSaver(cloudSaver);
        betterSecret.save();



    }
}
