package KI_35.Dzoban.Lab6;

import java.io.*;
import java.util.*;

/**
 * Class Calculation implements method for (sin(x)/cos(x)) expression calculation
 * @author Mykola Dzoban
 * @version 1.0.0
 */
public class Calculation {
    private double y;
    /**
     * Method calculate the (sin(x)/cos(x)) expression
     * @param x Angel in degrees
     * @throws CalcException
     */
    public void calculate(double  x) throws CalcException {
        double rad;
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
    }

    /**
     * @return Result of the (sin(x)/cos(x)) expression
     */
    public double getResult(){
        return y;
    }

    public void writeResTxt(String fName) throws FileNotFoundException
    {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ", y);
        f.close();
    }

    public void readResTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                y = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }

    public void writeResBin(String fName) throws FileNotFoundException, IOException
    {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(y);
        f.close();
    }

    public void readResBin(String fName) throws FileNotFoundException, IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        y = f.readDouble();
        f.close();
    }
}
