public class StrBuild {
    public String sBild(String alphabet) {
        alphabet.replaceAll("(?m)^\\s*$[\r\n]+", "");
        StringBuilder stringBuilder = new StringBuilder();
// Проверка первого символа В начале строки на Прописную букву и Добавление символа перед ним
        if (Character.isUpperCase(alphabet.charAt(0))) {
            stringBuilder.append(";;").append(alphabet.charAt(0));
            for (int i = 1; i < alphabet.length(); i++) {
                if (Character.isUpperCase(alphabet.charAt(i))) {  //Проверка строки на наличие прописных букв и добавление символа '++' перед ними
                    stringBuilder.append(";").append(alphabet.charAt(i));
                } else if (alphabet.charAt(i) == '.') {  // Проверка на точку
                    stringBuilder.append("::");
                } else if (alphabet.charAt(i) == ' ') { // замена пробела на "_"
                    stringBuilder.append("_");

                } else {
                    stringBuilder.append(alphabet.charAt(i));
                }
            }
        }
        return String.valueOf(stringBuilder);
    }
}

