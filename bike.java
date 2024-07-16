package abstractvehicle;

public class bike extends vehicle{
    @Override
    void start() {
        System.out.println("bike start with kick");
    }
    void gearchange(int gear){
        System.out.println("Number of gear in bike is 4");
    }
}
