
import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class MyFrame10 extends Frame implements ActionListener{
    Button button1,button2,button3;
    int n=0;
    Random rand;
    public MyFrame10(){
        super("0");
        super.setBounds(0,0,400,400);
        this.setVisible(true);
        super.setLayout(new FlowLayout());
        rand=new Random();
        button1=new Button("Quit");
        button2=new Button("Increment");
        button3=new Button("Decrement");
        super.add(button1);
        super.add(button2);
        super.add(button3);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        switch(e.getActionCommand()){
            case ("Increment"):
                super.setTitle(Integer.toString(++n));

                setBackground(new Color(rand.nextInt(256),rand.nextInt(256), rand.nextInt(256)));
                break;
            case ("Decrement"):
                super.setTitle(Integer.toString(--n));

                setBackground(new Color(rand.nextInt(256),rand.nextInt(256), rand.nextInt(256)));
                break;
            default:

                System.exit(0);
        }
    }
}

public class Assignment3_3 {
    public static void main(String[] args) {
        Frame fr=new MyFrame10();
    }

}

