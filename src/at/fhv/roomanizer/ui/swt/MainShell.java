package at.fhv.roomanizer.ui.swt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class MainShell {

	Shell shell;

	public MainShell() {
		
		Display display = new Display();
		
		shell = new Shell(display);
		shell.setText("Roomanizer");
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
