package tasks;

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Построить частотный словарь(Map) символов английского или русского алфавита.
 * Для этого взять любой большой кусок текста и сохранить его в файле.
 * Соответственно в коде надо из файла читать.
 */
public class Task03 {

    public static void main(String[] args) {
        try {
            Map<Character, Long> frequencies = new HashMap<>();
            String fileName = args[1];
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                Character[] letters = data.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                frequencies = Stream.of(letters).collect(
                Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
                )
            );
            }
            myReader.close();
            System.out.println(frequencies);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("An error found!");
            e.printStackTrace();
        }
    }

}
