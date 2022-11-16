import KI_35.Dzoban.Lab6.*;


import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * Class Main implements driver for Calculation class
 * @author Mykola Dzoban
 * @version 1.0.0
 */
public class Main {
    /**
     * @param args Main class argument
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try
        {
            Calculation obj = new Calculation();
            Scanner s = new Scanner(System.in);
            out.print("Enter file name: ");
            String fName = s.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try
            {
                try
                {
                    System.out.print("Enter data: ");
                    double data = s.nextDouble();
                    obj.calculate(data);
                    System.out.println("Result is: " + obj.getResult());
                    fout.print("Result is: " + obj.getResult());
                    RandomAccessFile raf = new RandomAccessFile("randomFile.txt", "rw");
                    raf.write("RandomAccessFile".getBytes());

                    obj.writeResTxt("textRes.txt");
                    obj.writeResBin("BinRes.bin");

                    obj.readResBin("BinRes.bin");
                    System.out.println("Result from BinRes file is: " + obj.getResult());
                    obj.readResTxt("textRes.txt");
                    System.out.println("Result from textRes file is: " + obj.getResult());

                }
                finally
                {
                    fout.flush();
                    fout.close();
                }
            }
            catch (CalcException ex)
            {
                out.print(ex.getMessage());
//                FileWriter fstream =new FileWriter(fName);
//                BufferedWriter out=new BufferedWriter(fstream);
//                out.write(ex.toString());
//                out.close();
            }
        }
        catch (FileNotFoundException ex)
        {
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}