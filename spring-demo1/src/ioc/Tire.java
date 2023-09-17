package ioc;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-17
 * Time: 15:41
 */
public class Tire {
    int size;
    String color;

    public Tire(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Tire(int size) {
        this.size = size;
    }

    public void init() {
        System.out.println("执行了 Tire init; size: " + size + "; color: " + color);
    }
}
