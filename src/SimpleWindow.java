import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SimpleWindow extends JFrame {
    SimpleWindow() {
        super("WINDOW 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE); // закрывает окно нажатием на крестик
        TextToAudio textToAudio = new TextToAudio();

        JTextArea textArea = new JTextArea(40, 40);
        JButton click = new JButton("сlik");// Создание кнопки

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); // FlowLayout - Менеджер последовательного размещения

//Созданное поле добавляется в окно аплета методом add.
        panel.add(textArea);
        panel.add(click);

        setContentPane(panel); // Метод setContentPane(JPanel panel) позволяет заменить панель содержимого окна.
        pack(); // подобраны оптимальным образом с учетом предпочтений всех элементов, размещенных в этом окне.

// метод для сохранения в файл введенного текста в поле
        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String d = textArea.getText();

                //Запишем в файл какой-нибудь текст:
                try {
                    FileWriter writer = new FileWriter("F:\\textToAudio/doc.txt");
                    writer.write(d);
                    writer.flush();//Данные, которые вы записываете в Writer, иногда временно хранятся в буфере, метод flush() используется для сброса (flush) всех данных из буфера в целевой объект.
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                BufferedReader brTest = null;
                try {
                    brTest = new BufferedReader(new FileReader("F:\\textToAudio/doc.txt"));
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }

                String text = null;
                try {
                    text = brTest.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    textToAudio.textToAudio(text);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}