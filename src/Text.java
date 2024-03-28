import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Text {

    public char[] textFormat(String texts) throws IOException {

        List<String> lines2 = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        // создание списка из текстового файла
        List<String> lines = Files.readAllLines(Paths.get("F:\\textToAudio/doc.txt"));

//Добавление '_' в конце строки с помощью StringBuilder
        for (String dd : lines) {
            dd.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
            builder.append(dd + "_");
        }

        // перевод StringBuilder в Строку
        String result = builder.toString();


        //Замена пробелов на '_'
        lines2.add(result.replaceAll("\\s", "_"));

//преобразуем все буквы в листе строк в верхний регистр
        lines2.replaceAll(String::toUpperCase);

        //преобразовать массив строк в массив символов
        char[] characters = String.join("", lines2).toCharArray();

        //Удаление самого последнего пробела
        characters[characters.length - 1] = 0;

//удалить 2 или более соседних символ '_' из массива
        for (int i = 0; i < characters.length; i++)
            while (characters[i] == '_' && characters[i + 1] == '_') { // проверка если два пробела подряд
                for (int j = (i + 1); j < characters.length; j++)
                    characters[j - 1] = characters[j]; // shift the rest of array  - сдвинуть остальную часть массива
                characters[i] = '_';
                characters[characters.length - 1] = 0;
            }

        return characters;
    }
}
