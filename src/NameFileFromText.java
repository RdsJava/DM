public class NameFileFromText {

    public String nameFileFromText(String text) {

        // Выборка первой строки из файла (для Названия сохраняемого файла)
        //Удаление пробелов в начале и в конце первой строки (для Названия сохраняемого файла)
        String string = text.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
        String firstStringNoWhiteSpaceStartEnd = string.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        firstStringNoWhiteSpaceStartEnd = firstStringNoWhiteSpaceStartEnd.toUpperCase();

        return firstStringNoWhiteSpaceStartEnd;
    }

}
