package gui;
import java.awt.*;
import java.awt.event.*;
public class calculator {
    static class a extends Frame implements ActionListener{
        Label l1,l2,l3;
        TextField t1,t2,out;
        Button b1;
        a(){
            setLayout(null);
            l1=new Label("Value of A ");
            l1.setBounds(20, 50, 100, 20);
            add(l1);
            t1=new TextField("0",5);
            t1.setBounds(150, 50, 100, 20);
            add(t1);


            setLayout(null);
            l2=new Label("Value of B ");
            l2.setBounds(20, 90, 100, 20);
            add(l2);
            t2=new TextField("0",5);
            t2.setBounds(150, 90, 100, 20);
            add(t2);

            b1=new Button("Calculate");
            b1.setBounds(50, 130, 120, 30);
            add(b1);
            b1.addActionListener(this);

            l3 = new Label("Result:");
            l3.setBounds(20, 180, 100, 20);
            add(l3);

            out = new TextField();
            out.setBounds(150, 180, 100, 20);
            out.setEditable(false);
            add(out);

            // Frame settings
            setSize(300, 300);
            setVisible(true);

            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });
        }
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());

            int sum = n1 + n2;

            out.setText(String.valueOf(sum));
        }
    }

    public static void main(String [] args){
        new a();
    }
}
