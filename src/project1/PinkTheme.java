package project1;
import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class PinkTheme extends DefaultMetalTheme {

	public String getName() {

		return "Pink";
	}

	private final ColorUIResource primary1 = new ColorUIResource (120, 0, 120);
	private final ColorUIResource primary2 = new ColorUIResource (215, 0, 215);
	private final ColorUIResource primary3 = new ColorUIResource (255, 0, 255);

	protected ColorUIResource getPrimary1() { return primary1; }
	protected ColorUIResource getPrimary2() { return primary2; }
	protected ColorUIResource getPrimary3() { return primary3; }

}