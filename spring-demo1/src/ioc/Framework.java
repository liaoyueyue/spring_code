package ioc;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-17
 * Time: 15:40
 */
public class Framework {
    Bottom bottom;

    public Framework(Bottom bottom) {
        this.bottom = bottom;
    }

    public void init() {
        // 依赖底盘
        System.out.println("执行了 Framework init");
        bottom.init();
    }
}
