package alarmclock;

import javax.swing.*;

public class Clock1 extends JFrame {
    private Container c;
    private Font f, f1, f2, f3, f4;
    private JLabel jLabel1, jLabel2, jLabel3, jLabel4, imgLabel;
    private ImageIcon icon;
    private ImageIcon img, img2, img3;
    private JTextField tfh, tfm, tfam;
    private JButton btnOk, btnStop, btncl;

    public int temp_h, temp_m;
    public String temp_am;
    private int flag = 1;

    Clock1() {
        initComponents();
        currentTime();
    }
    public static final String path = "E:/_.Programming/Java/zzzzzz_____icons/beep_alarm.mp3";
    MP3Player mp3 = new MP3Player(new File(path));

}
