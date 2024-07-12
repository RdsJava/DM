import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextToAudioChiklo {

    public void textToAudioChiklo(String file) throws IOException {

        String filePathName = "F:\\textToAudio/готовое/";
        Concatenate cikloH = new Concatenate();
        List<String> ciklo = new ArrayList<>();
        List<String> lines2 = new ArrayList<>();

        RenameFile renameFileF = new RenameFile();
        Duration duration = new Duration();
        Pad pad = new Pad();
        StringBuilder builder = new StringBuilder();

        char[] alphabet = {'_', 'А', 'Б', 'В', 'Г', 'Д', 'Е',
                'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н',
                'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц',
                'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

        // Выборка первой строки из файла (для Названия сохраняемого файла)
        //Удаление пробелов в начале и в конце первой строки (для Названия сохраняемого файла)
        String firstStringNoWhiteSpaceStartEnd = file.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
        String fileName = firstStringNoWhiteSpaceStartEnd.toUpperCase();


        // создание списка из текстового файла
        List<String> lines = Files.readAllLines(Paths.get("F:\\textToAudio/doc.txt"));

//Добавление '_' в конце строки с помощью StringBuilder
        for (String dd : lines) {
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

        // Добавление фразы в начало
        //ciklo.add("F:\\textToAudio/название/" + text2 + ".wav");
        ciklo.add("F:\\textToAudio/Начало_переизлучения.wav");

// создание списка для сборки wav файла на ЦиклоХладавит (_оль.wav - Хладастея минус)
// создание списка для сборки wav файла на Ритмохладавит (_ИРЪ.wav - Блокиратор)
// создание списка для сборки wav файла на Номерной Хладавит (0.wav - Хладастея Даль)

        for (char character : characters)
            for (int i = 0; i < alphabet.length; i++)
                if (character == alphabet[i]) {
                    ciklo.add("F:\\textToAudio/Ciklo_DM/" + alphabet[i] + "оль.wav");
                }
// Добавление фразы в конце
        ciklo.add("F:\\textToAudio/Конец_переизлучения.wav");

        // Добавление варианта музыки рамдомным способом в конце.
        int rdm = (int) (Math.random() * 5);
        ciklo.add("F:\\textToAudio/Sound/v" + rdm + ".wav");

//визуальный блок проверки
        String listStringC = String.join(", ", ciklo);
        String listStringC2 = listStringC.replace("оль.wav, F:\\textToAudio/Ciklo_DM/","");
        System.out.println("Циклохладавит - " + listStringC2);

              //System.out.println(Math.random() + " " + rdm); // рандом не превышает 5
        System.out.println(characters); // визуально проверять на символы '_'
       // System.out.println(ciklo);

        try {
            cikloH.concatenateFiles(ciklo, filePathName + fileName + "_Ц+ ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        File fileC = new File(filePathName + fileName + "_Ц+ ");

        renameFileF.rename(filePathName + fileName + "_Ц+ ", duration.durationFile(fileC), ".wav");

    }
}