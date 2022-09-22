import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;  
public class test_2 extends Applet implements ActionListener{
    Label l1,l2,l3,l4;
    Button b1;
    TextField t1,t2,t3,t4;
    Vector<Integer> arr = new  Vector<Integer>();
    Integer x=0,i,j=4;
    public void init(){
        l1 = new Label("X1");
        l2 = new Label("X2");
        l3 = new Label("Y1");
        l4 = new Label("Y2");
        b1 = new Button("Circle");
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        t4 = new TextField(20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g){
        j=0;
        for(int i=0; i<arr.size()/4; i++){
            g.drawOval(arr.get(j) ,arr.get(j+1) , arr.get(j+2) , arr.get(j+3));
            j+=4;
        }
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            arr.add(Integer.parseInt(t1.getText()));   
            arr.add(Integer.parseInt(t2.getText()));
            arr.add(Integer.parseInt(t3.getText()));
            arr.add(Integer.parseInt(t4.getText())); 
            repaint();
        }
    }
}   