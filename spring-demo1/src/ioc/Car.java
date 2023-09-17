package ioc;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-17
 * Time: 15:40
 */
public class Car {
    Framework framework;

    public Car(Framework framework) {
        this.framework = framework;
    }

    public void init() {
        // 依赖框架
        System.out.println("执行了 Car init");
        framework.init();
    }
}
