package at.fhv.roomanizer.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

public class MainShell {

	Shell shell;
	Tabs tabs;

	public MainShell() {
		
		Display display = new Display();
		
		/**
		 * Setting up the main shell
		 */
		shell = new Shell(display);
		shell.setText("Roomanizer");
		shell.setLayout(new FillLayout());
		

		/**
		 * Top Menu Part
		 */
	    Menu menuBar = new Menu(shell, SWT.BAR);
	    MenuItem fileMenuHeader = new MenuItem(menuBar, SWT.CASCADE);
	    fileMenuHeader.setText("File");
	    
	    /**
		 *Tabs Part
		 */
		tabs = new Tabs(shell, SWT.None);
		shell.open();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public static void main(String[] args){
		MainShell mainShell = new MainShell();	
	}
	
}
