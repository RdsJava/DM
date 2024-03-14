import javax.swing.*;
        import java.io.IOException;

class Main {

    public static void main(String[] args) throws IOException {

        //Создание окна для ввода текста
        JFrame myWindow = new SimpleWindow(); /** Для окна нужна "рама" - Frame */
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // закрывает окно нажатием на крестик
        myWindow.setVisible(true);  /** Чтобы отобразить окно на экране */

    }
}