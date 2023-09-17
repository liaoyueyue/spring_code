package ioc;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-17
 * Time: 15:44
 */
public class App {
    public static void main(String[] args) {
        Tire tire = new Tire(15, "yellow");
        Bottom bottom = new Bottom(tire);
        Framework framework = new Framework(bottom);
        Car car = new Car(framework);
        car.init();
    }
}
