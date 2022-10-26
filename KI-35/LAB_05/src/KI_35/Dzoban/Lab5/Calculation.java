package KI_35.Dzoban.Lab5;

/**
 * Class Calculation implements method for (sin(x)/cos(x)) expression calculation
 * @author Mykola Dzoban
 * @version 1.0.0
 */
public class Calculation {
    /**
     * Method calculate the (sin(x)/cos(x)) expression
     * @param x Angel in degrees
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException {
        double y, rad;
        rad = (x * Math.PI) / 180.0;

        try {
            y = Math.sin(rad) / Math.cos(rad);

            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || x == 90 || x == -90)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
            if (rad == Math.PI / 2.0 || rad == -Math.PI / 2.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }

        return y;
    }
}

