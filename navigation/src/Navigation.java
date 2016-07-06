import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Navigation extends JComponent {

    public static JFrame mishu = new JFrame("Mishu");
    public JButton first = new JButton("first");
    public JButton second = new JButton("second");
    public JButton third = new JButton("third");

    public JButton firstchildone = new JButton("child1");
    public JButton firstchildtwo = new JButton("child2");
    public JButton firstchildthree = new JButton("child3");

    public JButton secondchildone = new JButton("child1");
    public JButton secondchildtwo = new JButton("child2");
    public JButton secondchildthree = new JButton("child3");

    public JButton thirdchildone = new JButton("child1");
    public JButton thirdchildtwo = new JButton("child2");
    public JButton thirdchildthree = new JButton("child3");

    public JPanel page = new JPanel();

    public Boolean firstclicked = false;
    public Boolean secondclicked = false;
    public Boolean thirdclicked = false;


    public static void main(String args[]) {
        Navigation navigation = new Navigation();
        mishu.setBackground(Color.WHITE);
        mishu.setSize(300,500);
        mishu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mishu.setResizable(false);
        navigation.homepage();
        navigation.repaint();
        mishu.setVisible(true);
    }

    public void homepage() {
        page.setLayout(null);
        page.add(first);
        first.setBounds(0,430,100,50);
        page.add(second);
        second.setBounds(100,430,100,50);
        page.add(third);
        third.setBounds(200,430,100,50);
        mishu.add(page);

        first.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                secondclicked = false;
                thirdclicked = false;
                if (firstclicked == false) {
                    firstclicked = true;
                    page.remove(secondchildone);
                    page.remove(secondchildtwo);
                    page.remove(secondchildthree);
                    page.remove(thirdchildone);
                    page.remove(thirdchildtwo);
                    page.remove(thirdchildthree);
                    page.add(firstchildone);
                    firstchildone.setBounds(20,380,80,50);
                    page.add(firstchildtwo);
                    firstchildtwo.setBounds(20,330,80,50);
                    page.add(firstchildthree);
                    firstchildthree.setBounds(20,280,80,50);
                    page.repaint();
                } else {
                    firstclicked = false;
                    page.remove(firstchildone);
                    page.remove(firstchildtwo);
                    page.remove(firstchildthree);
                    page.repaint();
                }
            }
        });

        second.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                firstclicked = false;
                thirdclicked = false;
                if (secondclicked == false) {
                    secondclicked = true;
                    page.remove(firstchildone);
                    page.remove(firstchildtwo);
                    page.remove(firstchildthree);
                    page.remove(thirdchildone);
                    page.remove(thirdchildtwo);
                    page.remove(thirdchildthree);
                    page.add(secondchildone);
                    secondchildone.setBounds(120,380,80,50);
                    page.add(secondchildtwo);
                    secondchildtwo.setBounds(120,330,80,50);
                    page.add(secondchildthree);
                    secondchildthree.setBounds(120,280,80,50);
                    page.repaint();
                } else {
                    secondclicked = false;
                    page.remove(secondchildone);
                    page.remove(secondchildtwo);
                    page.remove(secondchildthree);
                    page.repaint();
                }
            }
        });

        third.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                firstclicked = false;
                secondclicked = false;
                if (thirdclicked == false) {
                    thirdclicked = true;
                    page.remove(firstchildone);
                    page.remove(firstchildtwo);
                    page.remove(firstchildthree);
                    page.remove(secondchildone);
                    page.remove(secondchildtwo);
                    page.remove(secondchildthree);
                    page.add(thirdchildone);
                    thirdchildone.setBounds(220,380,80,50);
                    page.add(thirdchildtwo);
                    thirdchildtwo.setBounds(220,330,80,50);
                    page.add(thirdchildthree);
                    thirdchildthree.setBounds(220,280,80,50);
                    page.repaint();
                } else {
                    thirdclicked = false;
                    page.remove(thirdchildone);
                    page.remove(thirdchildtwo);
                    page.remove(thirdchildthree);
                    page.repaint();
                }
            }
        });
    }
}
