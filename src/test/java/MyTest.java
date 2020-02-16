import com.mashibing.inter.Calculator;
import com.mashibing.inter.MyCalculator;
import com.mashibing.proxy.CalculatorProxy;

public class MyTest {
    public static void main(String[] args) {
        Calculator calculator = CalculatorProxy.getProxy(new MyCalculator());
        try {
            calculator.div(1, 0);
        } catch (Exception ignored) {

        }
    }
}
