package task70;

import sun.misc.Regexp;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task70 {

    private static final String INPUT_FILE_PATH = "input.txt";
    private static final String OUTPUT_FILE_PATH = "output.txt";

    public static void main(String[] args) throws IOException {
        writeDataToFile(calculating(readDataFromFile("")));
    }

    public static void writeDataToFile(String calculating) {
        try(BufferedWriter writeBuff = new BufferedWriter(new FileWriter(OUTPUT_FILE_PATH,false))) {
            writeBuff.write(calculating);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи");
        }
    }

    public static ArrayList<String> readDataFromFile(String path) throws IOException {
        if (path.isEmpty()){
            path = INPUT_FILE_PATH;
        }
            ArrayList<String> arrayOfLine = new ArrayList<>();
            String buffLine;
            BufferedReader readerBuff = new BufferedReader(new FileReader(path));
            while ((buffLine = readerBuff.readLine()) != null) {
                arrayOfLine.add(buffLine);
            }
            return arrayOfLine;
    }

    public static String calculating(ArrayList<String> data) {
        String buffLine = "";
        String line = data.get(0);
        int power = Integer.parseInt(data.get(1));
        if (power>0) {
            for (int i = 0; i < power; i++) {
                buffLine += line;
            }
        }
        if (power<0) {
            for (int i = 0; i < line.length() / (-power); i++) {
                buffLine += line.toCharArray()[i];
            }
            Pattern pattern = Pattern.compile("(" + buffLine + ")+");
            Matcher match = pattern.matcher(line);
            if (!match.matches()) {
                return "NO SOLUTION";
            }
        }
        if (buffLine.length()>1023){
            return buffLine.substring(0,1022);
        }
        if (buffLine.isEmpty()){
            return "NO SOLUTION";
        }
        return buffLine;
    }
}
