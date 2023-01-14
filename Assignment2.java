import java.awt.Color;
import java.awt.Frame;
import java.util.Date;

class MyFrame4 extends Frame{
    static int w=0;
    static int h=0;
    static int n=1;
    public MyFrame4(String title,Color c){
        title+=" "+(n++);
        super.setTitle(title);
        this.setSize(400,400);
        setLocation(w,h);
        w+=385;
        if(w==1540){
            w=0;
            h+=400;
        }
        this.setVisible(true);
        super.setTitle(title);
        super.setBackground(c);
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        Frame fr=new MyFrame4("Aryan's Frame", new Color(251, 255, 214));
        Frame fr1=new MyFrame4("Aryan's Frame", new Color(165, 163, 193));
        Frame fr2=new MyFrame4("Aryan's Frame", new Color(194, 204, 196));
        Frame fr3=new MyFrame4("Aryan's Frame", new Color(155, 185, 202));
        Frame fr4=new MyFrame4("Aryan's Frame", new Color(154, 157, 177));
        Frame fr5=new MyFrame4("Aryan's Frame", new Color(255, 228, 196));
        Frame fr6=new MyFrame4("Aryan's Frame", new Color(255, 232, 196));
        Frame fr7=new MyFrame4("Aryan's Frame", new Color(255, 220, 172));

    }

}