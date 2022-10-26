package KI_35.Dzoban.Lab6;

/**
 * Class CalcException more precises ArithmeticException
 * @author Mykola Dzoban
 * @version 1.0.0
 */
public class CalcException extends ArithmeticException {
    public CalcException(){}
    public CalcException(String message)
    {
        super(message);
    }
}