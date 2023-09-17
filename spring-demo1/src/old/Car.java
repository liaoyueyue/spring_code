package old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-17
 * Time: 2:04
 */
public class Car {
    Framework framework;

    public Car(int size) {
        framework = new Framework(size);
    }

    public void init() {
        System.out.println("执行了 Car init");
        // 依赖Framework
        framework.init();
    }
}
