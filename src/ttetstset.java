
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ttetstset {

    private static String label1 = "Unckecked";
    private static String label2 = "Checked";

    public static void main(String args[]) {

  JFrame jFrame = new JFrame("Selecting CheckBox");

  jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JCheckBox tickBox = new JCheckBox(label1);

  ActionListener actionListener = new ActionListener() {

@Override

public void actionPerformed(ActionEvent actionEvent) {

    AbstractButton absB = (AbstractButton) actionEvent.getSource();

    boolean slct = absB.getModel().isSelected();

    String nL = (slct ? label2 : label1);

    absB.setText(nL);

}

  };

  ChangeListener chListener = new ChangeListener() {

@Override

public void stateChanged(ChangeEvent changeEvent) {

    AbstractButton absB = (AbstractButton) changeEvent.getSource();

    ButtonModel bMod = absB.getModel();

    boolean armed = bMod.isArmed();

    boolean pressed = bMod.isPressed();

    boolean selected = bMod.isSelected();

    System.out.println("Changed: " + armed + "/" + pressed + "/" + selected);

}

  };

  ItemListener itemlistener = new ItemListener() {

@Override

public void itemStateChanged(ItemEvent itemE) {

    AbstractButton absB = (AbstractButton) itemE.getSource();

    Color fgrnd = absB.getForeground();

    Color bgrnd = absB.getBackground();

    int st = itemE.getStateChange();

    if (st == ItemEvent.SELECTED) {

  absB.setForeground(bgrnd);

  absB.setBackground(fgrnd);

    }

}

  };

  tickBox.addActionListener(actionListener);

  tickBox.addChangeListener(chListener);

  tickBox.addItemListener(itemlistener);

  tickBox.setMnemonic(KeyEvent.VK_S);

  Container contentPane = jFrame.getContentPane();

  contentPane.add(tickBox, BorderLayout.NORTH);

  jFrame.setSize(1152, 716);

  jFrame.setVisible(true);
    }
}