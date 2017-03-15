package project1;
import java.awt.*;
import java.beans.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//This class listens for UISwitches, and Updates the Components.

public class UISwitchListener implements PropertyChangeListener {

	JComponent componentToSwitch;

	public UISwitchListener (JComponent c) { componentToSwitch = c; }

	public void propertyChange (PropertyChangeEvent e) {

		String name = e.getPropertyName ();

		if (name.equals ("lookAndFeel")) {
			SwingUtilities.updateComponentTreeUI (componentToSwitch);
			componentToSwitch.invalidate ();
			componentToSwitch.validate ();
			componentToSwitch.repaint ();
		}

	}

}