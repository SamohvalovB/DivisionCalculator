import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.MathContext;

public class DivideListener extends CalcMain implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ev) {
        BigDecimal firstNumber;
        BigDecimal secondNumber;

        try {
            firstNumber = BigDecimal.valueOf(Double.parseDouble(firstText.getText()));
            secondNumber = BigDecimal.valueOf(Double.parseDouble(secondText.getText()));
            BigDecimal result = firstNumber.divide(secondNumber, MathContext.DECIMAL64);
            outputText.setText(result.toString());
        }
        catch (NumberFormatException formatEx) {outputText.setText("Укажите числовые значения.");}

        catch (ArithmeticException mathEx) {outputText.setText("Вы поделили на ноль.");}

        catch (Exception largeEx) {outputText.setText("Ошибка!");}
    }
}
