import com.mashibing.inter.MyCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        MyCalculator bean = context.getBean(MyCalculator.class);
        System.out.println("代理对象是" + bean.getClass());
        try {
            bean.add(1, 1);
            System.out.println();
            bean.div(1, 0);
        } catch (Exception ignored) {

        }
    }
}
