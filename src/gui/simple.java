package gui;
import java.awt.*;
public class simple {
   static class a extends Frame{
        a(){
            Button b=new Button("click me ");
            b.setBounds(100,100,100,50);
            setSize(200,200);
            setLayout(null);
            setVisible(true);
            add(b);
        }
    }
    public static void main(String[] args){
        a obj=new a();
    }
}
