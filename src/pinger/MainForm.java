package pinger;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.InetAddress;
import java.security.PrivateKey;

public class MainForm {
    public JPanel mainPanel;
    public JLabel name;
    public JButton button;
    public JRadioButton RadioButton1;
    public JRadioButton RadioButton2;
    public JRadioButton RadioButton3;
    public JRadioButton RadioButton4;
    public JRadioButton RadioButton5;
    public JTextArea label;
    public JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel JPanel1;

    private static final int TIMEOUT = 3 * 1000;
    JRadioButton[] array = new JRadioButton[]{RadioButton1, RadioButton2, RadioButton3, RadioButton4, RadioButton5};
    private String nameup;
    String ip;


    boolean ping(String addr) {

        try {
            InetAddress address = InetAddress.getByName(addr);
            return address.isReachable(TIMEOUT);
        } catch (IOException exc){
            return false;
        }
    }

    public void pingers() {
        if (RadioButton1.isSelected()){
            long t = System.currentTimeMillis();
            if (ping("8.8.8.8")) { //Здесь указывается ip-адрес компании
                long CurrentTime = System.currentTimeMillis() - t;
                label.setText(label.getText() + "Google Сервер доступен " + CurrentTime + "мс\n"); //Здесь указывается название компании
            }
            else
                label.setText(label.getText() +"Google Сервер не доступен \n"); //Здесь указывается название компании
        }
        else{}
        if (RadioButton2.isSelected()){
            long t = System.currentTimeMillis();
            if (ping("77.88.55.80")) { //Здесь указывается ip-адрес компании
                long CurrentTime = System.currentTimeMillis() - t;
                label.setText(label.getText() + "Яндекс Сервер доступен " + CurrentTime + "мс\n"); //Здесь указывается название компании
            }
            else
                label.setText(label.getText() + "Яндекс Сервер не доступен \n"); //Здесь указывается название компании
        }
        else{}
        if (RadioButton3.isSelected()){
            long t = System.currentTimeMillis();
            if (ping("17.253.144.10")) { //Здесь указывается ip-адрес компании
                long CurrentTime = System.currentTimeMillis() - t;
                label.setText(label.getText() + "Apple Сервер доступен " + CurrentTime + "мс\n"); //Здесь указывается название компании
            }
            else
                label.setText(label.getText() +"Apple Сервер не доступен \n"); //Здесь указывается название компании
        }
        else{}
        if (RadioButton4.isSelected()){
            long t = System.currentTimeMillis();
            if (ping("87.240.137.158")) { //Здесь указывается ip-адрес компании
                long CurrentTime = System.currentTimeMillis() - t;
                label.setText(label.getText() + "ВК Сервер доступен " + CurrentTime + "мс\n"); //Здесь указывается название компании
            }
            else
                label.setText(label.getText() +"ВК Сервер не доступен \n"); //Здесь указывается название компании
        }
        else{}
        if (RadioButton5.isSelected()){
            long t = System.currentTimeMillis();
            if (ping("5.61.23.11")) { //Здесь указывается ip-адрес компании
                long CurrentTime = System.currentTimeMillis() - t;
                label.setText(label.getText() + "ОК Сервер доступен " + CurrentTime + "мс\n"); //Здесь указывается название компании
            }
            else
                label.setText(label.getText() +"ОК Сервер не доступен \n"); //Здесь указывается название компании
        }
        else{}
    }

    public void newPopup() {
        this.nameup = nameup;
        JFrame jFrame = new JFrame("Создание нового объекта");
        JDialog jd = new JDialog(jFrame);
        jd.setVisible(true);
        jd.setLayout(new FlowLayout());
        jd.setBounds(500, 300, 400, 300);
        JLabel jLabel = new JLabel("Введите параметры кнопки:");
        jLabel.setPreferredSize(new Dimension(250, 20));
        JLabel jLabelip = new JLabel("Ip-адрес");
        jLabelip.setPreferredSize(new Dimension(300, 30));
        JTextArea JtextArea = new JTextArea(" ");
        JtextArea.setPreferredSize(new Dimension(300, 20));
        JLabel jLabelname = new JLabel("Имя объекта");
        jLabelname.setPreferredSize(new Dimension(300, 30));
        JTextArea JtextAreaname = new JTextArea(" ");
        JtextAreaname.setPreferredSize(new Dimension(300, 20));
        JButton jButton = new JButton("Сохранить");
        jd.add(jLabel);
        jd.add(jLabelip);
        jd.add(JtextArea);
        jd.add(jLabelname);
        jd.add(JtextAreaname);
        jd.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jd.setVisible(false);
                JRadioButton but = new JRadioButton();
                nameup = JtextAreaname.getText();
                but.setText(nameup);
                JPanel1.add(but);
                JPanel1.revalidate();
            }
        });
    }

    public MainForm(){
        button.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("");
                pingers();
            }
        });
        button2.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {
            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("");
                for (int i = 0; i < array.length; i++) {
                    array[i].setSelected(false);
                }
            }
        });
        button3.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                Inputfile file = new Inputfile();
                file.fileInput(label.getText());
            }
        });
        button4.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                String message = "Обновления:\n04.08.22\n\n 1) Появилось это меню\n 2) Оптимизирован код для сохрания файла\n 3) Теперь файл сохраняется в папку с программой\n 4) Если файла логов нет, то он сам создается\n 5) Создан шаблон для дальнейшей разработки меню добавления новых объектов";
                JOptionPane.showMessageDialog(mainPanel, message, "Обновления",JOptionPane.PLAIN_MESSAGE);
            }
        });
        button5.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                newPopup();
            }
        });
    }





    public JPanel getMainPanel(){
        return mainPanel;
    }
}
