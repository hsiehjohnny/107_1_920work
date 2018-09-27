import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Mainframe extends JFrame {
    private JPasswordField jtf = new JPasswordField();
    private String x = "23323456";
    private String str = new String("");
    //private JLabel jlb = new JLabel("");
    private Container cp;
    private JPanel jpl = new JPanel(new GridLayout(3, 4, 5, 5));
    private JButton jbt0 = new JButton("0");
    private JButton jbt1 = new JButton("1");
    private JButton jbt2 = new JButton("2");
    private JButton jbt3 = new JButton("3");
    private JButton jbt4 = new JButton("4");
    private JButton jbt5 = new JButton("5");
    private JButton jbt6 = new JButton("6");
    private JButton jbt7 = new JButton("7");
    private JButton jbt8 = new JButton("8");
    private JButton jbt9 = new JButton("9");
    private JButton jbt10 = new JButton("Submit");
    private JButton jbt11 = new JButton("Exit");

    public Mainframe() {
        init();
    }

    public void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 600);
        this.setTitle("密碼輸入920work");
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(4, 4));
        cp.add(jtf, BorderLayout.NORTH);
        cp.add(jpl, BorderLayout.CENTER);
        // cp.add(jlb, BorderLayout.SOUTH);
        jtf.setOpaque(true);
        jtf.setBackground(new Color(250, 100, 60));
        jtf.setFont(new Font(null, Font.BOLD, 30));
        jpl.add(jbt0);
        jbt0.setFont(new Font(null, Font.PLAIN, 35));
        jpl.add(jbt1);
        jbt1.setFont(new Font(null, Font.PLAIN, 35));
        jpl.add(jbt2);
        jbt2.setFont(new Font(null, Font.PLAIN, 35));
        jpl.add(jbt3);
        jbt3.setFont(new Font(null, Font.PLAIN, 35));
        jpl.add(jbt4);
        jbt4.setFont(new Font(null, Font.PLAIN, 35));
        jpl.add(jbt5);
        jbt5.setFont(new Font(null, Font.PLAIN, 35));
        jpl.add(jbt6);
        jbt6.setFont(new Font(null, Font.PLAIN, 35));
        jpl.add(jbt7);
        jbt7.setFont(new Font(null, Font.PLAIN, 35));
        jpl.add(jbt8);
        jbt8.setFont(new Font(null, Font.PLAIN, 35));
        jpl.add(jbt9);
        jbt9.setFont(new Font(null, Font.PLAIN, 35));
        jpl.add(jbt10);
        jbt10.setFont(new Font(null, Font.PLAIN, 24));
        jpl.add(jbt11);
        jbt11.setFont(new Font(null, Font.PLAIN, 24));

        jbt0.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + "0";
                jtf.setText(jtf.getText() + "*");
                // jlb.setText(str);
            }
        });
        jbt1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + "1";
                jtf.setText(jtf.getText() + "*");
                // jlb.setText(str);
            }
        });
        jbt2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + "2";
                jtf.setText(jtf.getText() + "*");
                //  jlb.setText(str);
            }
        });
        jbt3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + "3";
                jtf.setText(jtf.getText() + "*");
                //     jlb.setText(str);
            }
        });
        jbt4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + "4";
                jtf.setText(jtf.getText() + "*");
                //    jlb.setText(str);
            }
        });
        jbt5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + "5";
                jtf.setText(jtf.getText() + "*");
                //  jlb.setText(str);
            }
        });
        jbt6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + "6";
                jtf.setText(jtf.getText() + "*");
                //   jlb.setText(str);
            }
        });
        jbt7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + "7";
                jtf.setText(jtf.getText() + "*");
                //   jlb.setText(str);
            }
        });
        jbt8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + "8";
                jtf.setText(jtf.getText() + "*");

                //    jlb.setText(str);
            }
        });
        jbt9.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = str + "9";
                jtf.setText(jtf.getText() + "*");
                //   jlb.setText(str);
            }
        });
        jbt10.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (str.equals(x)) {
                    JOptionPane.showMessageDialog(null, "密碼正確",
                            "確定", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "密碼錯誤",
                            "確定", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        jbt11.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}


