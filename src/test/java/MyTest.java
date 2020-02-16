import com.mashibing.inter.MyCalculator;

public class MyTest {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        try {
            myCalculator.add(1, 1);
            myCalculator.sub(1, 1);
            myCalculator.mul(1, 1);
            myCalculator.div(1, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
