import KI_35.Dzoban.Lab5.*;


import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * Class Main implements driver for Calculation class
 * @author Mykola Dzoban'
 * @version 1.0.0
 */
public class Main {
    /**
     * @param args Main class argument
     */
    public static void main(String[] args)
    {
        try
        {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try
            {
                try
                {
                    Calculation calc = new Calculation();
                    out.print("Enter X: ");
                    fout.print(calc.calculate(in.nextInt())+"\n");
                    out.print("Enter X for test: ");
                    fout.print(calc.calculate(in.nextInt()));
                }
                finally
                {
                    fout.flush();
                    fout.close();
                }
            }
            catch (CalcException | ExceptionTest ex)
            {
                out.print(ex.getMessage());
            }

        }
        catch (FileNotFoundException ex)
        {
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}
