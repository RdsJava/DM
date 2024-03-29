import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SimpleWindow extends JFrame {
   public SimpleWindow() {
       setTitle("WINDOW 1");



        TextToAudioChiklo textToAudioChiklo = new TextToAudioChiklo();
        TextToAudioNomernoi textToAudioNomernoi = new TextToAudioNomernoi();
        TextToAudioRitmo textToAudioRitmo = new TextToAudioRitmo();
        TextToAudioR100 textToAudioR100 = new TextToAudioR100();
        TextToAudioRadasteid textToAudioRadasteid = new TextToAudioRadasteid();

         // подобраны оптимальным образом с учетом предпочтений всех элементов, размещенных в этом окне.
       JTextArea textArea = new JTextArea(80, 40);
       JButton click = new JButton("сlik");// Создание кнопки
       JCheckBox chiklo = new JCheckBox("Циклохладвит", false);
       JCheckBox nomernoi = new JCheckBox("Номерной", false);
       JCheckBox ritmo = new JCheckBox("Ритмохладавит", false);
       JCheckBox radasteid100 = new JCheckBox("Радастеид - 100", false);
       JCheckBox radasteid = new JCheckBox("Радастеид", false);



       JPanel panel = new JPanel();
       panel.setLayout(new FlowLayout()); // FlowLayout - Менеджер последовательного размещения

//Созданное поле добавляется в окно аплета методом add.
       panel.add(textArea);
       panel.add(click);

       panel.add(chiklo);
       panel.add(nomernoi);
       panel.add(ritmo);
       panel.add(radasteid100);
       panel.add(radasteid);

       setContentPane(panel); // Метод setContentPane(JPanel panel) позволяет заменить панель содержимого окна.
       pack();


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
                    if (chiklo.isSelected()) {
                        textToAudioChiklo.textToAudioChiklo(text);
                    }
                    if (nomernoi.isSelected()) {
                        textToAudioNomernoi.textToAudioNomernoi(text);
                    }
                    if (ritmo.isSelected()) {
                        textToAudioRitmo.textToAudioRitmo(text);
                    }
                    if (radasteid100.isSelected()) {
                        textToAudioR100.textToAudioR100(text);
                    }
                    if (radasteid.isSelected()) {
                        textToAudioRadasteid.textToAudioRadasteid(text);
                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
   }
}