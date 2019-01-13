package my_package.solid.open_close_principle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Secret {
    private String mySecret;
    private String path;
    public Secret(String mySecret, String path) {
        this.mySecret = mySecret;
        this.path = path;
    }

    public void save(){
//        Writer writer = new BufferedWriter(new FileWriter(path));
        System.out.println(String.format("Saving secret to file: [%s]", path));
    }

    public String getMySecret() {
        return mySecret;
    }

    public void setMySecret(String mySecret) {
        this.mySecret = mySecret;
    }

    @Override
    public String toString() {
        return "Secret{" +
                "mySecret='" + mySecret + '\'' +
                '}';
    }
}
