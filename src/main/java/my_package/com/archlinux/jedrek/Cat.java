package my_package.com.archlinux.jedrek;

public class Cat {

    private String name;

    public Cat(){


    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();

        System.out.println(cat1);

    }

    public Cat(String name) {
        this.name = name;
    }
}
