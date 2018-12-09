package my_package.com.archlinux.jedrek;

public class Computers {

    private String producer;
    private String cpu;
    private int ram;


    public Computers(String producer, String cpu, int ram){
        setProducer(producer);
        setCpu(cpu);
        setRam(ram);


    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "producer='" + producer + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                '}';
    }

    public static void main(String[] args) {
        Computers toshiba = new Computers("toshiba", "i7", 4);
        Computers dell = new Computers("dell", "i5", 8);

        System.out.println(toshiba);
        System.out.println(dell);
    }
}
