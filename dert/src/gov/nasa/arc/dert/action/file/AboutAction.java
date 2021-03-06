package gov.nasa.arc.dert.action.file;

import gov.nasa.arc.dert.Dert;
import gov.nasa.arc.dert.action.MenuItemAction;

/**
 * Provides a pop up window that displays the current DERT version as well as an
 * about string and a list of supporting software.
 *
 */
public class AboutAction extends MenuItemAction {

	protected String version;

	/**
	 * Constructor
	 * 
	 * @param aboutStr
	 */
	public AboutAction(String version) {
		super("About DERT");
		this.version = version;
	}

	@Override
	public void run() {		
		AboutBox aboutBox = new AboutBox(Dert.getMainWindow(), version, "DERT");
		aboutBox.open();
	}

}
