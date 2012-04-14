package at.fhv.roomanizer.ui.swt.reservationexplorer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ReservationFilters extends Composite  {

	public ReservationFilters(Composite parent, int style) {
		super(parent, style);
		
		
		GridLayout layout = new GridLayout();
	    layout.numColumns = 6;
	    layout.makeColumnsEqualWidth = false;
	  
	    this.setLayout(layout);
		
		initUI();
	}

	private void initUI() {
		
		// Filter Reservationsnummer
		Label resNr = new Label(this, SWT.NONE);
		resNr.setText("Res. Nr.:");
		Text text = new Text(this,SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		// Filter Reservationsnummer
		Label name = new Label(this, SWT.NONE);
		name.setText("Name.:");
		text = new Text(this,SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		// Arrival
		Label arrivalDate = new Label(this, SWT.NONE);
		arrivalDate.setText("Arrival Date.:");
		DateTime dateFrom = new DateTime(this, SWT.BORDER | SWT.DATE | SWT.DROP_DOWN);
		dateFrom.setDate(2012, 0, 1);
	}

}
