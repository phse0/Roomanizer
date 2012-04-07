package at.fhv.roomanizer.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class Dashboard extends Composite{
	
	public Dashboard(Composite parent, int style) {		
		super(parent, style);
		
		GridLayout layout = new GridLayout();
	    layout.numColumns = 3;
	    layout.makeColumnsEqualWidth = true;
	    this.setLayout(layout);
		
		initUI();
	}

	private void initUI() {
		
		// Create the big button in the upper left
	    GridData data = new GridData(GridData.FILL_BOTH);
	    data.widthHint = 200;
	    
	    Button reservation = new Button(this, SWT.PUSH);
	    reservation.setText("Reservationen");
	    reservation.setLayoutData(data);
		
		Button walkIn = new Button(this, SWT.PUSH);
		walkIn.setText("Walk-In");
		walkIn.setLayoutData(data);
	
		Button checkIn = new Button(this, SWT.PUSH);
		checkIn.setText("Check-In");
		checkIn.setLayoutData(data);
		
		Button customers = new Button(this, SWT.PUSH);
		customers.setText("Customers");
		customers.setLayoutData(data);
		
		Button calendar = new Button(this, SWT.PUSH);
		calendar.setText("Calendar");
		calendar.setLayoutData(data);
		
		Button todos = new Button(this, SWT.PUSH);
		todos.setText("Todos");
		todos.setLayoutData(data);
	}
	
}
