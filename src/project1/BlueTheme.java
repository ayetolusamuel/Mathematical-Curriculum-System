package project1;
import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class BlueTheme extends DefaultMetalTheme {

	public String getName() {

		return "Blue";
	}

	private final ColorUIResource primary1 = new ColorUIResource (20, 100, 190);
	private final ColorUIResource primary2 = new ColorUIResource (35, 125, 230);
	private final ColorUIResource primary3 = new ColorUIResource (50, 135, 235);

	protected ColorUIResource getPrimary1() { return primary1; }
	protected ColorUIResource getPrimary2() { return primary2; }
	protected ColorUIResource getPrimary3() { return primary3; }

}