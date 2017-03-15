package project1;
import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class OrangeTheme extends DefaultMetalTheme {

	public String getName () {

		 return "Orange";

	}

	private final ColorUIResource primary1 = new ColorUIResource (185, 60, 0);
	private final ColorUIResource primary2 = new ColorUIResource (255, 150, 100);
	private final ColorUIResource primary3 = new ColorUIResource (255, 175, 125);

	protected ColorUIResource getPrimary1() { return primary1; }
	protected ColorUIResource getPrimary2() { return primary2; }
	protected ColorUIResource getPrimary3() { return primary3; }

}