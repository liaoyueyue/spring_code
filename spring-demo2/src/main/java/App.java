import com.demo.controller.StudentController;
import com.demo.controller.UserController;
import com.demo.model.Student;
import com.demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-09-17
 * Time: 16:33
 */
@Controller
public class App {
    public static void main(String[] args) {
/*        // 1.先得到 spring 对象
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        // 2.从 spring 中取出 Bean 对象
        User user = (User) context.getBean("user");
        // 3.使用 Bean （可选）
        System.out.println(user.sayHi());*/

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//        UserController userController = context.getBean("userController", UserController.class);
//        System.out.println(userController.sayHi());
//
//        UserService userService = context.getBean("userService", UserService.class);
//        userService.sayHi();

//        Student student = context.getBean("student1", Student.class);
//        System.out.println(student);
//        student = context.getBean("student2", Student.class);
//        System.out.println(student);

        StudentController sc = context.getBean("studentController", StudentController.class);
        sc.sayHi();

    }
}
