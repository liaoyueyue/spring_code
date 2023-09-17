package old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-17
 * Time: 2:06
 */
public class Bottom {
    Tire tire;

    public Bottom(int size) {
        tire = new Tire(size);
    }
    public void init() {
        System.out.println("执行了 Bottom init");
        // 依赖轮胎
        tire.init();
    }
}
