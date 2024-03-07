import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextToAudioRadasteid {

    public void textToAudio(String file) throws IOException {


        String filePathName = "F:\\textToAudio/готовое/";

        Concatenate RadasteidH = new Concatenate();

        List<String> Radasteid = new ArrayList<>();

        List<String> lines2 = new ArrayList<>();

        RenameFile renameFileF = new RenameFile();
        Duration duration = new Duration();
        StringBuilder builder = new StringBuilder();

        char[] alphabet = {'_', 'А', 'Б', 'В', 'Г', 'Д', 'Е',
                'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н',
                'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц',
                'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я',
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
                'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
                'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
                'ъ', 'ы', 'ь', 'э', 'ю', 'я', ',', '.', '!'};

        // Выборка первой строки из файла (для Названия сохраняемого файла)
        //Удаление пробелов в начале и в конце первой строки (для Названия сохраняемого файла)
        String fileName = file.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
        //String fileName = firstStringNoWhiteSpaceStartEnd.toUpperCase();

        // создание списка из текстового файла
        List<String> lines = Files.readAllLines(Paths.get("doc.txt"));

        //Добавление '_' в конце строки с помощью StringBuilder
        for (String string : lines) {
            builder.append(string + "_");
        }
        System.out.println("Добавление '_' в конце строки с помощью StringBuilder " + builder);

        // перевод StringBuilder в Строку
        String result = builder.toString();
        System.out.println("// перевод StringBuilder в Строку " + result);

        //Замена пробелов на '_'
        lines2.add(result.replaceAll("\\s", "_"));

        //преобразовать массив строк в массив символов
        char[] characters = String.join("", lines2).toCharArray();

        //Удаление последнего пробела в конце текста
        characters[characters.length - 1] = 0;

        //удалить 2 или более соседних символов '_' из массива
        for (int i = 0; i < characters.length; i++)
            while (characters[i] == '_' && characters[i + 1] == '_') { // проверка если два пробела подряд
                for (int j = (i + 1); j < characters.length; j++)
                    characters[j - 1] = characters[j]; // shift the rest of array  - сдвинуть остальную часть массива
                characters[i] = '_';
                characters[characters.length - 1] = 0;
            }

        // Добавление фразы в начало
        //Radasteid.add("F:\\textToAudio/название/" + text2 + ".wav");
        //Radasteid.add("F:\\textToAudio/Начало_переизлучения.wav");

        // создание списка для сборки wav файла на ЦиклоХладавит (_.wav - Радастея 25)

        for (char character : characters)
            for (int i = 0; i < alphabet.length; i++)
                if (character == alphabet[i]) {
                    if (Character.isUpperCase(alphabet[i])) {
                        Radasteid.add("F:\\textToAudio/Radasteid/25.wav");
                        Radasteid.add("F:\\textToAudio/Radasteid/Big/" + alphabet[i] + ".wav");
                    } else if ('.' == alphabet[i] || '!' == alphabet[i]) {
                        Radasteid.add("F:\\textToAudio/Radasteid/25.wav");
                        Radasteid.add("F:\\textToAudio/Radasteid/Smoll/" + "_Отделяет предложения 142(2) Радастея 0 N.wav");
                    } else {
                        Radasteid.add("F:\\textToAudio/Radasteid/Smoll/" + alphabet[i] + ".wav");
                    }
                }

        // Добавление фразы в конце
        // Radasteid.add("F:\\textToAudio/Конец_переизлучения.wav");


        // Добавление варианта музыки рандомным способом в конце.
        // int rdm = (int) (Math.random() * 5);
        //Radasteid.add("F:\\textToAudio/Sound/v" + rdm + ".wav");

        //визуальный блок проверки
        // System.out.println(Math.random() + " " + rdm); // рандом не превышает 5
        String listString = String.join(", ", Radasteid);
        String listString2 = listString.replace(".wav, F:\\textToAudio/Radasteid/Smoll/","");
        String listString3 = listString2.replace(".wav, F:\\textToAudio/Radasteid/Big/","");
        String listString4 = listString3.replace(".wav, F:\\textToAudio/Radasteid/","");
        System.out.println("String - " + listString4);

        //System.out.print("Визуально проверять на символы '_' ");
        //System.out.println(characters);// визуально проверять на символы '_'
        //System.out.println();
        //System.out.println("Радастеид" + Radasteid);

        try {
            RadasteidH.concatenateFiles(Radasteid, filePathName + fileName + "_РА ");

        } catch (
                Exception e) {
            e.printStackTrace();
        }

        //Создание
        File fileC = new File(filePathName + fileName + "_РА ");

        //Переименование файла
        renameFileF.rename(filePathName + fileName + "_РА ", duration.durationFile(fileC), ".wav");
    }
}