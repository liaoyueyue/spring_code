import com.demo.component.ArticleController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-17
 * Time: 16:33
 */
public class App {
    public static void main(String[] args) {
/*        // 1.先得到 spring 对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        // 2.从 spring 中取出 Bean 对象
        User user = (User) context.getBean("user");
        // 3.使用 Bean （可选）
        System.out.println(user.sayHi());*/

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ArticleController articleController = context.getBean("articleController", ArticleController.class);
        System.out.println(articleController.sayHi());

    }
}
