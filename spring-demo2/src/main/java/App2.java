import com.demo.component.AComponent;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-21
 * Time: 22:21
 */
public class App2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        AComponent aComponent = context.getBean("AComponent", AComponent.class);
    }
}
/**
 * Bean 的⽣命周期分为以下 5 ⼤部分：
 * 1.实例化 Bean（为 Bean 分配内存空间）
 * 2.设置属性（Bean 注⼊和装配）
 * 3.Bean 初始化
 * 实现了各种 Aware 通知的⽅法，如 BeanNameAware、BeanFactoryAware、
 * ApplicationContextAware 的接⼝⽅法；
 * 执⾏ BeanPostProcessor 初始化前置⽅法；
 * 执⾏ @PostConstruct 初始化⽅法，依赖注⼊操作之后被执⾏；
 * 执⾏⾃⼰指定的 init-method ⽅法（如果有指定的话）；
 * 执⾏ BeanPostProcessor 初始化后置⽅法。
 * 4.使⽤ Bean
 * 5.销毁 Bean
 */

/**
 * Bean 执⾏流程（Spring 执⾏流程）：启动 Spring 容器 -> 实例化 Bean（分配内存空间，从⽆到
 * 有） -> Bean 注册到 Spring 中（存操作） -> 将 Bean 装配到需要的类中（取操作)。
 */
