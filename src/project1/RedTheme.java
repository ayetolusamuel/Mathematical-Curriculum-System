package project1;
import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class RedTheme extends DefaultMetalTheme {

	public String getName() {

		return "Red";
	}

	private final ColorUIResource primary1 = new ColorUIResource (80, 10, 25);
	private final ColorUIResource primary2 = new ColorUIResource (195, 10, 45);
	private final ColorUIResource primary3 = new ColorUIResource (200, 10, 65);

	protected ColorUIResource getPrimary1() { return primary1; }
	protected ColorUIResource getPrimary2() { return primary2; }
	protected ColorUIResource getPrimary3() { return primary3; }

}
