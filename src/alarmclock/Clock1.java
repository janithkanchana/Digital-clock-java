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

    //shashini start
    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(1270, 170, 560, 320);
        this.setTitle("Alarm Clock");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        f1 = new Font("Arial", Font.BOLD, 20);
        f2 = new Font("Digital-7 Mono", Font.BOLD, 46);
        f3 = new Font("Digital-7", Font.PLAIN, 90);
        f4 = new Font("Tahoma", Font.BOLD, 36);

        icon = new ImageIcon(getClass().getResource("Miscellaneous-Icon.jpg"));
        this.setIconImage(icon.getImage());

        img = new ImageIcon(getClass().getResource("alarm.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(30, 215, img.getIconWidth(), 40);
        c.add(imgLabel);
        //shashini end
    }
    }
}
