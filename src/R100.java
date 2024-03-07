import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class R100 {
    public void r100(String file) throws IOException {
        //public static void main(String[] args) throws IOException {

        int firstCharString;
        String filePathName = "F:\\textToAudio/готовое/";


        List<String> r100 = new ArrayList<>();

        List<String> slovoFormat = new ArrayList<>();
        List<String> linesR100_2 = new ArrayList<>();

        Concatenate r100H = new Concatenate();
        RenameFile renameFileF = new RenameFile();
        Duration duration = new Duration();

        Map<Character, String> radasteid100 = new HashMap<>();
        Map<String, String> radasteid100Razdelitel = new HashMap<>();

        radasteid100.put('А', "F:\\textToAudio/R100/26А.wav");
        radasteid100.put('Б', "F:\\textToAudio/R100/23Б.wav");
        radasteid100.put('В', "F:\\textToAudio/R100/31В.wav");
        radasteid100.put('Г', "F:\\textToAudio/R100/5Г.wav");
        radasteid100.put('Д', "F:\\textToAudio/R100/24Д.wav");
        radasteid100.put('Е', "F:\\textToAudio/R100/30Е.wav");
        radasteid100.put('Ё', "F:\\textToAudio/R100/12Ё.wav");
        radasteid100.put('Ж', "F:\\textToAudio/R100/8Ж.wav");
        radasteid100.put('З', "F:\\textToAudio/R100/33З.wav");
        radasteid100.put('И', "F:\\textToAudio/R100/21И.wav");
        radasteid100.put('Й', "F:\\textToAudio/R100/22Й.wav");
        radasteid100.put('К', "F:\\textToAudio/R100/18К.wav");
        radasteid100.put('Л', "F:\\textToAudio/R100/27Л.wav");
        radasteid100.put('М', "F:\\textToAudio/R100/25М.wav");
        radasteid100.put('Н', "F:\\textToAudio/R100/15Н.wav");
        radasteid100.put('О', "F:\\textToAudio/R100/29О.wav");
        radasteid100.put('П', "F:\\textToAudio/R100/32П.wav");
        radasteid100.put('Р', "F:\\textToAudio/R100/19Р.wav");
        radasteid100.put('С', "F:\\textToAudio/R100/7С.wav");
        radasteid100.put('Т', "F:\\textToAudio/R100/36Т.wav");
        radasteid100.put('У', "F:\\textToAudio/R100/6У.wav");
        radasteid100.put('Ф', "F:\\textToAudio/R100/35Ф.wav");
        radasteid100.put('Х', "F:\\textToAudio/R100/20Х.wav");
        radasteid100.put('Ц', "F:\\textToAudio/R100/34Ц.wav");
        radasteid100.put('Ч', "F:\\textToAudio/R100/13Ч.wav");
        radasteid100.put('Ш', "F:\\textToAudio/R100/11Ш.wav");
        radasteid100.put('Щ', "F:\\textToAudio/R100/10Щ.wav");
        radasteid100.put('Ъ', "F:\\textToAudio/R100/17Ъ.wav");
        radasteid100.put('Ы', "F:\\textToAudio/R100/14Ы.wav");
        radasteid100.put('Ь', "F:\\textToAudio/R100/16Ь.wav");
        radasteid100.put('Э', "F:\\textToAudio/R100/4Э.wav");
        radasteid100.put('Ю', "F:\\textToAudio/R100/9Ю.wav");
        radasteid100.put('Я', "F:\\textToAudio/R100/28Я.wav");
        radasteid100.put('а', "F:\\textToAudio/R100/26А.wav");
        radasteid100.put('б', "F:\\textToAudio/R100/23Б.wav");
        radasteid100.put('в', "F:\\textToAudio/R100/31В.wav");
        radasteid100.put('г', "F:\\textToAudio/R100/5Г.wav");
        radasteid100.put('д', "F:\\textToAudio/R100/24Д.wav");
        radasteid100.put('е', "F:\\textToAudio/R100/30Е.wav");
        radasteid100.put('ё', "F:\\textToAudio/R100/12Ё.wav");
        radasteid100.put('ж', "F:\\textToAudio/R100/8Ж.wav");
        radasteid100.put('з', "F:\\textToAudio/R100/33З.wav");
        radasteid100.put('и', "F:\\textToAudio/R100/21И.wav");
        radasteid100.put('й', "F:\\textToAudio/R100/22Й.wav");
        radasteid100.put('к', "F:\\textToAudio/R100/18К.wav");
        radasteid100.put('л', "F:\\textToAudio/R100/27Л.wav");
        radasteid100.put('м', "F:\\textToAudio/R100/25М.wav");
        radasteid100.put('н', "F:\\textToAudio/R100/15Н.wav");
        radasteid100.put('о', "F:\\textToAudio/R100/29О.wav");
        radasteid100.put('п', "F:\\textToAudio/R100/32П.wav");
        radasteid100.put('р', "F:\\textToAudio/R100/19Р.wav");
        radasteid100.put('с', "F:\\textToAudio/R100/7С.wav");
        radasteid100.put('т', "F:\\textToAudio/R100/36Т.wav");
        radasteid100.put('у', "F:\\textToAudio/R100/6У.wav");
        radasteid100.put('ф', "F:\\textToAudio/R100/35Ф.wav");
        radasteid100.put('х', "F:\\textToAudio/R100/20Х.wav");
        radasteid100.put('ц', "F:\\textToAudio/R100/34Ц.wav");
        radasteid100.put('ч', "F:\\textToAudio/R100/13Ч.wav");
        radasteid100.put('ш', "F:\\textToAudio/R100/11Ш.wav");
        radasteid100.put('щ', "F:\\textToAudio/R100/10Щ.wav");
        radasteid100.put('ъ', "F:\\textToAudio/R100/17Ъ.wav");
        radasteid100.put('ы', "F:\\textToAudio/R100/14Ы.wav");
        radasteid100.put('ь', "F:\\textToAudio/R100/16Ь.wav");
        radasteid100.put('э', "F:\\textToAudio/R100/4Э.wav");
        radasteid100.put('ю', "F:\\textToAudio/R100/9Ю.wav");
        radasteid100.put('я', "F:\\textToAudio/R100/28Я.wav");
        radasteid100.put('_', "F:\\textToAudio/R100/38ОЗРА.wav");
        radasteid100.put('.', "F:\\textToAudio/R100/3ФШ.wav");


        radasteid100Razdelitel.put("А", "F:\\textToAudio/R100/26А.wav");
        radasteid100Razdelitel.put("Б", "F:\\textToAudio/R100/23Б.wav");
        radasteid100Razdelitel.put("В", "F:\\textToAudio/R100/31В.wav");
        radasteid100Razdelitel.put("Г", "F:\\textToAudio/R100/5Г.wav");
        radasteid100Razdelitel.put("Д", "F:\\textToAudio/R100/24Д.wav");
        radasteid100Razdelitel.put("Е", "F:\\textToAudio/R100/30Е.wav");
        radasteid100Razdelitel.put("Ё", "F:\\textToAudio/R100/12Ё.wav");
        radasteid100Razdelitel.put("Ж", "F:\\textToAudio/R100/8Ж.wav");
        radasteid100Razdelitel.put("З", "F:\\textToAudio/R100/33З.wav");
        radasteid100Razdelitel.put("И", "F:\\textToAudio/R100/21И.wav");
        radasteid100Razdelitel.put("Й", "F:\\textToAudio/R100/22Й.wav");
        radasteid100Razdelitel.put("К", "F:\\textToAudio/R100/18К.wav");
        radasteid100Razdelitel.put("Л", "F:\\textToAudio/R100/27Л.wav");
        radasteid100Razdelitel.put("М", "F:\\textToAudio/R100/25М.wav");
        radasteid100Razdelitel.put("Н", "F:\\textToAudio/R100/15Н.wav");
        radasteid100Razdelitel.put("О", "F:\\textToAudio/R100/29О.wav");
        radasteid100Razdelitel.put("П", "F:\\textToAudio/R100/32П.wav");
        radasteid100Razdelitel.put("Р", "F:\\textToAudio/R100/19Р.wav");
        radasteid100Razdelitel.put("С", "F:\\textToAudio/R100/7С.wav");
        radasteid100Razdelitel.put("Т", "F:\\textToAudio/R100/36Т.wav");
        radasteid100Razdelitel.put("У", "F:\\textToAudio/R100/6У.wav");
        radasteid100Razdelitel.put("Ф", "F:\\textToAudio/R100/35Ф.wav");
        radasteid100Razdelitel.put("Х", "F:\\textToAudio/R100/20Х.wav");
        radasteid100Razdelitel.put("Ц", "F:\\textToAudio/R100/34Ц.wav");
        radasteid100Razdelitel.put("Ч", "F:\\textToAudio/R100/13Ч.wav");
        radasteid100Razdelitel.put("Ш", "F:\\textToAudio/R100/11Ш.wav");
        radasteid100Razdelitel.put("Щ", "F:\\textToAudio/R100/10Щ.wav");
        radasteid100Razdelitel.put("Ъ", "F:\\textToAudio/R100/17Ъ.wav");
        radasteid100Razdelitel.put("Ы", "F:\\textToAudio/R100/14Ы.wav");
        radasteid100Razdelitel.put("Ь", "F:\\textToAudio/R100/16Ь.wav");
        radasteid100Razdelitel.put("Э", "F:\\textToAudio/R100/4Э.wav");
        radasteid100Razdelitel.put("Ю", "F:\\textToAudio/R100/9Ю.wav");
        radasteid100Razdelitel.put("Я", "F:\\textToAudio/R100/28Я.wav");
        radasteid100Razdelitel.put("а", "F:\\textToAudio/R100/26А.wav");
        radasteid100Razdelitel.put("б", "F:\\textToAudio/R100/23Б.wav");
        radasteid100Razdelitel.put("в", "F:\\textToAudio/R100/31В.wav");
        radasteid100Razdelitel.put("г", "F:\\textToAudio/R100/5Г.wav");
        radasteid100Razdelitel.put("д", "F:\\textToAudio/R100/24Д.wav");
        radasteid100Razdelitel.put("е", "F:\\textToAudio/R100/30Е.wav");
        radasteid100Razdelitel.put("ё", "F:\\textToAudio/R100/12Ё.wav");
        radasteid100Razdelitel.put("ж", "F:\\textToAudio/R100/8Ж.wav");
        radasteid100Razdelitel.put("з", "F:\\textToAudio/R100/33З.wav");
        radasteid100Razdelitel.put("и", "F:\\textToAudio/R100/21И.wav");
        radasteid100Razdelitel.put("й", "F:\\textToAudio/R100/22Й.wav");
        radasteid100Razdelitel.put("к", "F:\\textToAudio/R100/18К.wav");
        radasteid100Razdelitel.put("л", "F:\\textToAudio/R100/27Л.wav");
        radasteid100Razdelitel.put("м", "F:\\textToAudio/R100/25М.wav");
        radasteid100Razdelitel.put("н", "F:\\textToAudio/R100/15Н.wav");
        radasteid100Razdelitel.put("о", "F:\\textToAudio/R100/29О.wav");
        radasteid100Razdelitel.put("п", "F:\\textToAudio/R100/32П.wav");
        radasteid100Razdelitel.put("р", "F:\\textToAudio/R100/19Р.wav");
        radasteid100Razdelitel.put("с", "F:\\textToAudio/R100/7С.wav");
        radasteid100Razdelitel.put("т", "F:\\textToAudio/R100/36Т.wav");
        radasteid100Razdelitel.put("у", "F:\\textToAudio/R100/6У.wav");
        radasteid100Razdelitel.put("ф", "F:\\textToAudio/R100/35Ф.wav");
        radasteid100Razdelitel.put("х", "F:\\textToAudio/R100/20Х.wav");
        radasteid100Razdelitel.put("ц", "F:\\textToAudio/R100/34Ц.wav");
        radasteid100Razdelitel.put("ч", "F:\\textToAudio/R100/13Ч.wav");
        radasteid100Razdelitel.put("ш", "F:\\textToAudio/R100/11Ш.wav");
        radasteid100Razdelitel.put("щ", "F:\\textToAudio/R100/10Щ.wav");
        radasteid100Razdelitel.put("ъ", "F:\\textToAudio/R100/17Ъ.wav");
        radasteid100Razdelitel.put("ы", "F:\\textToAudio/R100/14Ы.wav");
        radasteid100Razdelitel.put("ь", "F:\\textToAudio/R100/16Ь.wav");
        radasteid100Razdelitel.put("э", "F:\\textToAudio/R100/4Э.wav");
        radasteid100Razdelitel.put("ю", "F:\\textToAudio/R100/9Ю.wav");
        radasteid100Razdelitel.put("я", "F:\\textToAudio/R100/28Я.wav");
        radasteid100Razdelitel.put("_", "F:\\textToAudio/R100/38ОЗРА.wav");
        radasteid100Razdelitel.put(".", "F:\\textToAudio/R100/3ФШ.wav");
        radasteid100Razdelitel.put("ЦЖ", "F:\\textToAudio/R100/1ЦЖ.wav");
        radasteid100Razdelitel.put("ЩХ", "F:\\textToAudio/R100/2ЩХ.wav");
        radasteid100Razdelitel.put("ФШ", "F:\\textToAudio/R100/3ФШ.wav");
        radasteid100Razdelitel.put("РИТЛ", "F:\\textToAudio/R100/37РИТЛ.wav");
        radasteid100Razdelitel.put("ОЗРА", "F:\\textToAudio/R100/38ОЗРА.wav");
        radasteid100Razdelitel.put("СТЛУ", "F:\\textToAudio/R100/39СТЛУ.wav");

        // Выборка первой строки из файла (для Названия сохраняемого файла)
        //Удаление пробелов в начале и в конце первой строки (для Названия сохраняемого файла)


        //String[] slovoString = {"*Слово_", "Первая_стРока_", "Вторая_строк_*_а."};
        char[] chars = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я',
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', '.', '_',
                '-', '+', '*'};

        char[] charsBig = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
        char[] charsSmall = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};


        // Прочтение файла
        FileReader fr = new FileReader("doc.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("docR100.txt");
        String line;

        // Удаление пустых строк и пробелов в конце и в начале строк
        while ((line = br.readLine()) != null) {
            line = line.trim(); // remove leading and trailing whitespace
            line = line.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
            line = line.replaceAll("\\s+", " ").trim().concat("\n");
            line = line.replaceAll("(?m)^[ \t]*\r?\n", ""); //удалением пустых строк

            if (!line.equals("")) {
                fw.write(line, 0, line.length());
            }
        }
        fr.close(); // Закрытие FileReader
        fw.close(); // Закрытие BufferedReader

        // Перевод файла в коллекцию
        List<String> linesR100 = Files.readAllLines(Paths.get("docR100.txt"));
        System.out.println("linesR100" + linesR100);

        //Замена пробелов на '_'
        for (String string : linesR100) {
            linesR100_2.add(string.replaceAll("\\s", "_"));
            System.out.println("Замена пробелов на _ " + linesR100_2);
        }

        // Переход коллекции в массив строк
        String[] slovoString_2 = linesR100_2.toArray(new String[linesR100_2.size()]);

        System.out.println("slovoString_2 ");
        for (String string : slovoString_2) {
            System.out.println(string);
        }

        //Добавление '_' в конце строки, если точка то не добавлять '_'
        char ch = '_';
        for (String string : slovoString_2) {
            if (string.charAt(string.length() - 1) != '.') {
                slovoFormat.add(String.format("%s%c", string, ch));
            } else {
                slovoFormat.add(string);
            }
        }

        // Добавление последней строки(без пробела) в массив
        // slovoFormat.add(slovoString_2[slovoString_2.length - 1]);

        System.out.println();
        System.out.println("slovoFormat " + slovoFormat);
        System.out.println();

        // Переход коллекции в массив строк
        String[] slovoString = slovoFormat.toArray(new String[slovoFormat.size()]);
        for (int i = 0; i < slovoString.length; i++) {
            System.out.println("slovoString-" + i + " " + slovoString[i]);
        }


        // Добавление фразы в начало
        r100.add("F:\\textToAudio/Начало_переизлучения.wav");
        System.out.println("Добавление фразы в начало");

        // Открывает переизлучение
        r100.add(radasteid100Razdelitel.get("РИТЛ"));
        System.out.println("Открывает переизлучение");

        //Первая строка из субстанции проходит проверку на первый символ(заглавная или строчная)
        for (int k = 0; k < slovoString.length; k++) {

            // Строка переходит в символы
            char[] charsStringSubstancii = slovoString[k].toCharArray();

            // Проверка первого символа строки на заглавную букву
            if (charsStringSubstancii[0] >= 'А' && charsStringSubstancii[0] <= 'Я') {
                System.out.println("Проверка первого символа" + charsStringSubstancii[0]);
                r100.add(radasteid100Razdelitel.get("ЦЖ"));
                firstCharString = 1; //Если первый символ в сторке большой, то начинать со второго символа
            }
            if (charsStringSubstancii[0] == 'Ё') {
                System.out.println("Проверка первого символа" + charsStringSubstancii[0]);
                r100.add(radasteid100Razdelitel.get("ЦЖ"));
                firstCharString = 1; //Если первый символ в сторке большой, то начинать со второго символа


                // Добавление буквы
                for (int r = 0; r < chars.length; r++) {
                    if (charsStringSubstancii[0] == chars[r]) {
                        System.out.println("Добавление буквы");
                        r100.add(radasteid100.get(chars[r]));
                    }
                }
            } else {
                firstCharString = 0;
            }


            // Создание массива (без первого большого символа или с первого строчного символа)
            for (int j = firstCharString; j < charsStringSubstancii.length; j++) {
                System.out.println("Создание массива (без первого большого символа или с первого строчного символа)");
                for (int i = 0; i < chars.length; i++) {
                    if (charsStringSubstancii[j] == chars[i]) {


                        String specialChars = "~`[email protected]#$%^&*()«»-=+\\|[{]};:'\",<>/?";

                        if ((String.valueOf(charsStringSubstancii[j])).contains(specialChars)) {
                            r100.add(radasteid100Razdelitel.get("ФШ"));
                        }

                        // Проверка на большой символ в середине строки (доделать чтобы не дублировать первый символ в строке)
                        for (int l = 0; l < charsBig.length; l++) {
                            if (charsStringSubstancii[j] == charsBig[l]) {
                                r100.add(radasteid100Razdelitel.get("ЩХ"));
                                r100.add(radasteid100.get(charsStringSubstancii[j]));
                                System.out.println("Проверка на большой символ в середине строки (доделать чтобы не дублировать первый символ в строке)");
                            }
                        }

                        // Проверка на маленький символ
                        for (int l = 0; l < charsSmall.length; l++) {
                            if (charsStringSubstancii[j] == charsSmall[l]) {
                                r100.add(radasteid100.get(charsStringSubstancii[j]));
                                System.out.println("Проверка на маленький символ");
                            }
                        }
                        // Проверка на точку
                        if (charsStringSubstancii[j] == '.') {
                            r100.add(radasteid100Razdelitel.get("ФШ"));
                            r100.add(radasteid100Razdelitel.get("СТЛУ"));
                            System.out.println("Проверка на точку");
                        }

                        // Проверка на пробел
                        if (charsStringSubstancii[j] == '_') {
                            r100.add(radasteid100.get('_'));
                            System.out.println("Проверка на пробел");
                        }

                        // возможно надо добавить на многоточие проверку(оставил как три точки)

                        //Добавить раскладывание цифр на буквы
                    }
                }
            }
        }

        // Закрывает переизлучение
        r100.add(radasteid100Razdelitel.get("РИТЛ"));

        // Добавление фразы в конце
        r100.add("F:\\textToAudio/Конец_переизлучения.wav");
        // Добавление варианта музыки рандомным способом в конце.
        int rdm = (int) (Math.random() * 5);
        r100.add("F:\\textToAudio/Sound/v" + rdm + ".wav");

        //Блок визуальной проверки

        System.out.println();
        System.out.println("r100 " + r100);

        //метод удаляет ненужные символы
        List<String> result4 = deleteExcessChar(r100);
        String listString = String.join(", ", result4);
        String listString2 = listString.replaceAll("\\s+","");
        String listString3 = listString2.replaceAll(","," ");

        System.out.println();
        System.out.println(listString3);

        String firstStringNoWhiteSpaceStartEnd = file.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
        String fileName = firstStringNoWhiteSpaceStartEnd.toUpperCase();


        try {
            r100H.concatenateFiles(r100, filePathName + fileName + "_Р100 ");
        } catch (Exception e) {
            e.printStackTrace();
        }

//Создание
        File fileR100 = new File(filePathName + fileName + "_Р100 ");

        renameFileF.rename(filePathName + fileName + "_Р100 ", duration.durationFile(fileR100), ".wav");
    }

    //метод удаляет ненужные символы
    // перевод deleteExcessChar(удалитеЛишнееСимвол)
    private static List<String> deleteExcessChar(List<String> r100) {
        List<String> result = new ArrayList<>();
        for (String s : r100) {
            result.add(s.replaceAll("F:", ""));
        }

        //Удаление  из строки "textToAudio/R100/"
        List<String> result2 = new ArrayList<>();
        for (String s : result) {
            result2.add(s.replaceAll("textToAudio/R100/", ""));
        }

        //Удаление первого символа и удаление последних 4 символов в строке
        List<String> result3 = new ArrayList<>();
        for (String s : result2) {
            result3.add(s.substring(1, s.length() - 4));
        }

        //удаление всех цифр из строки
        List<String> result4 = new ArrayList<>();
        for (String s : result3) {
            result4.add(s.replaceAll("\\d", ""));
        }
        return result4;
    }
}




