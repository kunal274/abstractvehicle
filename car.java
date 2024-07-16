package abstractvehicle;

public class car extends vehicle {
    @Override
    void start() {
        System.out.println("car start with key");
    }
    void gearchange(int gear){
        System.out.println("Number of gear in car is 5");
    }
}
