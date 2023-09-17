package old;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-17
 * Time: 2:06
 */
public class Framework {
    Bottom bottom;

    public Framework(int size) {
        bottom = new Bottom(size);
    }
    public void init() {
        System.out.println("执行了 Framework init");
        // 依赖 底盘
        bottom.init();
    }
}
