package abstractvehicle;

public class main {
    public static void main(String[] args) {
        vehicle b = new bike();
        b.start();
        b.gearchange(4);
        System.out.println("=================");
        vehicle c = new car();
        c.start();
        c.gearchange(5);
    }
}
