import java.io.IOException;

public class Alphabet {

    public char alphabet(String texts) throws IOException {
        char ch = 0;
        Text text2 = new Text();

        char[] alphabet = {'_', 'А', 'Б', 'В', 'Г', 'Д', 'Е',
                'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н',
                'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц',
                'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

        for (char character : text2.textFormat(texts))
            for (int i = 0; i < alphabet.length; i++)
                if (character == alphabet[i]) {
                    ch = alphabet[i];

                }
        return ch;
    }
}
