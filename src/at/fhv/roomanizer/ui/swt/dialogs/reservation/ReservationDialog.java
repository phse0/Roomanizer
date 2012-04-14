package at.fhv.roomanizer.ui.swt.dialogs.reservation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Shell;

public class ReservationDialog extends Dialog {
	
	List<Composite> _dialogViews;
	Composite _currentView;
	Shell _parent;
	final Shell _shell = new Shell(_parent, SWT.DIALOG_TRIM
			| SWT.APPLICATION_MODAL);
	Integer _index = 0;
	
	
	public ReservationDialog(Shell parent, int style) {
		super(parent, style);
		_dialogViews = new ArrayList<Composite>();
		initList();
	}
		

	public ReservationDialog(Shell parent) {
		this(parent, 0); // your default style bits go here (not the Shell's style bits)
	}

	public void open() {
		_parent = getParent();
		
		
		_shell.setText(getText());

		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		_shell.setLayout(layout);
	
		_shell.setText("Reservation Dialog");
		_shell.setSize(600, 450);

		// Dialogview goes here
		_currentView = _dialogViews.get(_index);
		_shell.open();
	}

	private void initList() {
		_dialogViews.add(new ReservationSelection(_shell, 0, _dialogViews, this));
	}
	
	public void nextView(){
		_index += 1;
		_currentView = _dialogViews.get(_index);
	}

}
