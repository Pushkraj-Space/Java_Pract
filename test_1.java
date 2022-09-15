import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class test_1 extends Applet implements ActionListener{
    TextField t1,t2;
    Label l1,l2;
    Button b[] = new Button[16];
    String str[] = {"0","1","2","3","4","5","6","7","8","9",".","+","-","*","/","="};
    int i;
    double prev=0,curr;
    char ch;
    public void init(){
        t1 = new TextField(20);
        add(t1);
        for(i=0; i<16; i++){
            b[i] = new Button(str[i]);
            add(b[i]);
        }
        for(i=0; i<16; i++){
            b[i].addActionListener(this);
        }
    }
    public void actionPerformed(ActionEvent e){
        for(i=0; i<11; i++){
            if(e.getSource() == b[i]){
                t1.setText(t1.getText() + str[i]);
            }
        }
        if(e.getSource() == b[11]){
            ch = '+';
            prev =  Double.parseDouble(t1.getText());
            t1.setText("");
        }else if(e.getSource() == b[12]){
            ch = '-';
            prev = Double.parseDouble(t1.getText());
            t1.setText("");
        }else if(e.getSource() == b[13]){
            ch = '*';
            prev = Double.parseDouble(t1.getText());
            t1.setText("");
        }else if(e.getSource() == b[14]){
            ch = '/';
            prev = Double.parseDouble(t1.getText());
            t1.setText("");
        }else if(e.getSource() == b[15]){
            if(ch == '+'){
                curr = Double.parseDouble(t1.getText());
                prev = prev + curr;
            }else if(ch == '-'){
                curr = Double.parseDouble(t1.getText());
                prev = prev - curr;
            }else if(ch == '*'){
                curr = Double.parseDouble(t1.getText());
                prev = prev * curr;
            }else if(ch == '/'){
                curr = Double.parseDouble(t1.getText());
                prev = prev / curr;
            }
            t1.setText(Double.toString(prev));
        }
    }
}
