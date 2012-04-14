package at.fhv.roomanizer.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class Reservator extends Composite{

	public Reservator(Composite parent, int style) {
		super(parent, style);
		
		GridLayout layout = new GridLayout();
	    layout.numColumns = 2;
	    layout.makeColumnsEqualWidth = false;
	  
	    this.setLayout(layout);
		
		initUI();
	}

	private void initUI() {
		ReservationForm reservationForm = new ReservationForm(this, SWT.NONE);
	}
}
