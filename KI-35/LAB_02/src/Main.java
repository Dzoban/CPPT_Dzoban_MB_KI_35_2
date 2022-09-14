import java.io.*;
import java.util.*;
/**
 * Клас Main реалізує приклад програми до лабораторної роботи №2
 *
 * @author Mykola Dzoban
 * @version 1.0.1
 * @since version 1.0
 *
 */
public class Main
{
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args function parameter
     * @throws FileNotFoundException check file existing
     *
     */
    public static void main(String... args) throws FileNotFoundException
    {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();
        int b = nRows%2;
        arr = new char[nRows][];
        for(int i = 0; i < nRows; i++)
        {
            arr[i]= new char[(nRows-b)/2];
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();

        exit:
        for(int i = 0; i < nRows; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(filler.length() == 1)
                {
                    arr[i][j] = (char) filler.codePointAt(0);
                    System.out.print("    "+arr[i][j]);
                    fout.print("    "+arr[i][j]);
                }
                else if (filler.length() == 0)
                {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                }
                else
                {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();

    }
}