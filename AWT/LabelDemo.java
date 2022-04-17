import java.awt.*;
import java.applet.*;

/* <applet code="LabelDemo" height= 400 width= 400> </applet> */

class LabelDemo extends Applet{
    public void init(){
        Label one = new Label("one");
        Label two = new Label("two");
        add(one);
        add(two);
    }
}
