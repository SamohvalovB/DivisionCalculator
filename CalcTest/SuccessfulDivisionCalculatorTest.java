import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;

final public class SuccessfulDivisionCalculatorTest extends CalcMain {
    public static void main(String[] args) {
        new SuccessfulDivisionCalculatorTest().testDivisionCalculator();
    }

    void testDivisionCalculator() {

        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            BigDecimal divided = BigDecimal.valueOf(rand.nextDouble() * rand.nextInt());
            BigDecimal divisor = BigDecimal.valueOf(rand.nextDouble() * rand.nextInt());
            System.out.println("Пара значений делимое/делитель - " + divided + "; " + divisor);

            firstText.setText(divided.toString());
            secondText.setText(divisor.toString());

            DivideListener divideListenerCase1 = new DivideListener();
            ActionEvent event = new ActionEvent(divideListenerCase1, ActionEvent.ACTION_PERFORMED, "");
            divideListenerCase1.actionPerformed(event);

            BigDecimal resultExpected = divided.divide(divisor, MathContext.DECIMAL64);
            System.out.println("Ожидаемый результат = " + resultExpected);
            BigDecimal resultPerformed = new BigDecimal(outputText.getText());
            System.out.println("Фактический результат = " + resultPerformed);

            if (resultExpected.equals(resultPerformed)) {
                System.out.println("Операция выполнена корректно");
                System.out.println("");
            } else {
                System.out.println("Операция выполнена некорректно");
                break;
            }
        }
        System.out.println("Тестовый сценарий завершён успешно");
    }
}
