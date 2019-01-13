package my_package.solid.open_close_principle.exc.domain;

public class User {
    private String info;

    public User(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "User{" +
                "info='" + info + '\'' +
                '}';
    }
}
