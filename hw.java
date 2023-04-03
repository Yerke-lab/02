import java.io.File;
import java.io.FileReader;
import java.io.*;

public class hw{ 

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        File file = new File("output.txt");
        PrintWriter pw = new PrintWriter(file);
        int[] array = null;
        try (BufferedReader in = new BufferedReader(new FileReader("input.txt")))
    {
            array = in.lines().mapToInt(Integer::parseInt).toArray();
    }
        catch (IOException | NumberFormatException e)
    {
            e.printStackTrace();
    }
        int a = array[0];
        int b = array[1];
        if(a == 0) {
            pw.println("не определено");
        }
        else {
            pw.println(Math.pow(a, b));
        }
        pw.close();  
    }
}


 