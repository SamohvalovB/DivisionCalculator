import java.awt.event.ActionEvent;

final public class StringDivisionTest extends CalcMain{
    public static void main(String[] args) {
        new StringDivisionTest().testDivideStrings();
    }

    void testDivideStrings() {
        String divided = "aaa";
        String divisor = "bbb";
        System.out.println("Пара значений делимое/делитель - " + divided + "; " + divisor);

        firstText.setText(divided);
        secondText.setText(divisor);

        DivideListener divideListenerCase3 = new DivideListener();

        ActionEvent event = new ActionEvent(divideListenerCase3, ActionEvent.ACTION_PERFORMED, "");
        divideListenerCase3.actionPerformed(event);
        if (outputText.getText().equals("Укажите числовые значения.")) {
            System.out.println("Исключение вида NumberFormatException");
            System.out.println("Тестовый сценарий завершён успешно");
        } else {
            System.out.println("Операция обработана некорректно");
        }
    }
}
