package my_package.solid.open_close_principle;

public class CloudSaver implements Saver<BetterSecret> {
    @Override
    public void save(BetterSecret secret) {
        System.out.println("Saving to a cloud...");
    }
}
