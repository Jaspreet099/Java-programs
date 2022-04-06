import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code = "Addition" margin="100" height="300" width="300">
</applet>*/

public class Addition extends Applet
{
    
    Label l1,l2,l3;
    TextField num1,num2,t3;
    Button b,c, d;
    int x,y,z;

public void init()
{

     l1 = new Label("Enter first number:");
     num1 = new TextField(15);
     l2 = new Label("Enter second number:");
     num2 = new TextField(15);
     l3 = new Label("Total=");
     t3 = new TextField(10);
     b = new Button("Add");
     d = new Button("Log");
     c = new Button("subtract");
     b.addActionListener(new test());
     c.addActionListener(new test());
d.addActionListener(new test());
    add(l1); 
    add(num1);
    add(l2); 
    add(num2);
    add(l3); 
    add(t3);
    add(b);
    add(c);
	add(d);

    t3.setEditable(false);
    

}
class test implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
 if(e.getSource() == b)
{
 x = Integer.parseInt(num1.getText());
 y = Integer.parseInt(num2.getText());
 z = x+y;
 t3.setText(String.valueOf(z));

} 
else{
     x = Integer.parseInt(num1.getText());
 y = Integer.parseInt(num2.getText());
 z = x-y;
 t3.setText(String.valueOf(z));

}
} 
}
}