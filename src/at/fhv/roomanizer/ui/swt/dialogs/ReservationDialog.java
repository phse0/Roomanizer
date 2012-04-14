package at.fhv.roomanizer.ui.swt.dialogs;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Shell;

public class ReservationDialog extends Dialog {
	
	public ReservationDialog(Shell parent, int style) {
		super(parent, style);
	}

	public ReservationDialog(Shell parent) {
		this(parent, 0); // your default style bits go here (not the Shell's style bits)
	}

	public void open() {
		Shell parent = getParent();
		final Shell shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		shell.setText(getText());
		
		shell.setText("Reservation Dialog");
		shell.setSize(600, 450);
		
		shell.open();
	}

}
