import com.mashibing.inter.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Calculator calculator = context.getBean(Calculator.class);
        try {
            calculator.div(1, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
