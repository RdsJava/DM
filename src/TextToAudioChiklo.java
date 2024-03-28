import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextToAudioChiklo {

    public void textToAudioChiklo(String texts) throws IOException {

        String filePathNameCiklo = "F:\\textToAudio/Chiklo_DM/";
        Concatenate cikloH = new Concatenate();
        List<String> ciklo = new ArrayList<>();
        Alphabet alphabetCiclo = new Alphabet();
        NameFileFromText nameFileFromText = new NameFileFromText();

        // Добавление фразы в начало
        ciklo.add(new StringStart().start());

        // создание списка для сборки wav файла на ЦиклоХладавит (_оль.wav - Хладастея минус)
        for (char character : new Text().textFormat(texts)) {
            ciklo.add(filePathNameCiklo + alphabetCiclo.alphabet(String.valueOf(character)) + "оль.wav");
        }

        // Добавление фразы в конце
        ciklo.add(new StringEnd().end());

        // Добавление варианта музыки рамдомным способом в конце.
        int rdm = (int) (Math.random() * 5);
        ciklo.add("F:\\textToAudio/Sound/v" + rdm + ".wav");


        try {
            cikloH.concatenateFiles(ciklo, "F:\\textToAudio/готовое/" + nameFileFromText.nameFileFromText(texts) + "_Ц+ ");
        } catch (Exception e) {
            e.printStackTrace();
        }
       RenameFile renameFile = new RenameFile();
       Duration duration =  new Duration();
        File fileC = new File(filePathNameCiklo + nameFileFromText.nameFileFromText(texts) + "_Ц+ ");
        System.out.println(fileC);
        renameFile.rename(String.valueOf(fileC), duration.durationFile(fileC), ".wav");

        //визуальный блок проверки
        String listStringC = String.join(", ", ciklo);
        String listStringC2 = listStringC.replace("оль.wav, " + filePathNameCiklo, "");
        System.out.println("Циклохладавит - " + listStringC2);
    }
}