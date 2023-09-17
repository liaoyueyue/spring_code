package ioc;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-17
 * Time: 15:41
 */
public class Bottom {
    Tire tire;

    public Bottom(Tire tire) {
        this.tire = tire;
    }

    public void init() {
        // 依赖轮胎
        System.out.println("执行了 Bottom init");
        tire.init();
    }
}
