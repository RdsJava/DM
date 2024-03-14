import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextToAudioRitmo {

    public void textToAudioRitmo(String file) throws IOException {

        String filePathName = "F:\\textToAudio/готовое/";

        Concatenate ritmoH = new Concatenate();
        List<String> ritmo = new ArrayList<>();
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

        ritmo.add("F:\\textToAudio/Начало_переизлучения.wav");

// создание списка для сборки wav файла на Ритмохладавит (_ИРЪ.wav - Блокиратор)
        for (char character : characters)
            for (int i = 0; i < alphabet.length; i++)
                if (character == alphabet[i]) {
                    ritmo.add("F:\\textToAudio/Ritmo_DM/" + alphabet[i] + "ИРЪ.wav");
                }

// Добавление фразы в конце
        ritmo.add("F:\\textToAudio/Конец_переизлучения.wav");
        // Добавление варианта музыки рамдомным способом в конце.
        int rdm = (int) (Math.random() * 5);
        ritmo.add("F:\\textToAudio/Sound/v" + rdm + ".wav");

//визуальный блок проверки
        String listStringR = String.join(", ", ritmo);
        String listStringR2 = listStringR.replace("ИРЪ.wav, F:\\textToAudio/Ritmo_DM/", "");
        System.out.println("Ритмохладавит - " + listStringR2);

        //System.out.println(Math.random() + " " + rdm); // рандом не превышает 5
        System.out.println(characters); // визуально проверять на символы '_'
        System.out.println(ritmo);

        try {
            ritmoH.concatenateFiles(ritmo, filePathName + fileName + "_Р+ ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        File fileR = new File(filePathName + fileName + "_Р+ ");
        renameFileF.rename(filePathName + fileName + "_Р+ ", duration.durationFile(fileR), ".wav");
    }
}