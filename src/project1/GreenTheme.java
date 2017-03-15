package project1;
import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class GreenTheme extends DefaultMetalTheme {

	public String getName() {

		return "Green";

	}

	private final ColorUIResource primary1 = new ColorUIResource (51, 142, 71);
	private final ColorUIResource primary2 = new ColorUIResource (102, 193, 122);
	private final ColorUIResource primary3 = new ColorUIResource (125, 235, 125);

	protected ColorUIResource getPrimary1() { return primary1; }
	protected ColorUIResource getPrimary2() { return primary2; }
	protected ColorUIResource getPrimary3() { return primary3; }

}