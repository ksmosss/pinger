package pinger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.TimeUnit;

public class MainForm extends Thread{
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
    private JCheckBox autopingCheckBox;
    private JButton button1;
    private JPanel JPanel1;
    private static final int TIMEOUT = 3 * 1000;

    private static boolean ping(String addr) {
        try {
            InetAddress address = InetAddress.getByName(addr);
            return address.isReachable(TIMEOUT);
        } catch (IOException exc){
            return false;
        }
    }

    public void pinger() {
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

    public MainForm(){
        button1.addActionListener(new Action() {
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
                JPanel1.add(new JRadioButton());
                JPanel1.requestFocus();
            }
        });
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
                    pinger();
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
                RadioButton1.setSelected(false);
                RadioButton2.setSelected(false);
                RadioButton3.setSelected(false);
                RadioButton4.setSelected(false);
                RadioButton5.setSelected(false);
            }
        });
    }


    public JPanel getMainPanel(){
        return mainPanel;
    }
}
