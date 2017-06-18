import java.awt.event.ActionEvent;

final public class DivisionByZeroTest extends CalcMain{
    public static void main(String[] args) {
        new DivisionByZeroTest().testDivideByZero();
    }

    void testDivideByZero() {
        String divided = "1";
        String divisor = "0";
        System.out.println("Пара значений делимое/делитель - " + divided + "; " + divisor);

        firstText.setText(divided);
        secondText.setText(divisor);

        DivideListener divideListenerCase2 = new DivideListener();

        ActionEvent event = new ActionEvent(divideListenerCase2, ActionEvent.ACTION_PERFORMED, "");
        divideListenerCase2.actionPerformed(event);
        if (outputText.getText().equals("Вы поделили на ноль.")) {
            System.out.println("Исключение вида ArithmeticalException");
            System.out.println("Тестовый сценарий завершён успешно");
        } else {
            System.out.println("Операция обработана некорректно");
        }
    }
}
