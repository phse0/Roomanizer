package at.fhv.roomanizer.ui.swt.reservationexplorer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import at.fhv.roomanizer.ui.swt.dialogs.SWTDialog;

public class ReservationDetailView extends Composite {
	
	final SWTDialog dialog;

	public ReservationDetailView(Composite parent, int style) {
		super(parent, style);
		
		GridLayout layout = new GridLayout();
	    layout.numColumns = 2;
	    layout.makeColumnsEqualWidth = false;
	  
	    this.setLayout(layout);
	    
	    //Create The Dialog for Create Reservation
	    dialog = new SWTDialog(parent.getShell());
		
		initUI();
	}

	private void initUI() {
		// Vorname
		Label fName = new Label(this, SWT.NONE);
		fName.setText("First name:");
		Text text = new Text(this,SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				
		// Nachname
		Label lName = new Label(this, SWT.NONE);
		lName.setText("Last name:");
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				
		// Ort
		Label place = new Label(this, SWT.NONE);
		place.setText("Place:");
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				
		// Zip code
		Label zip = new Label(this, SWT.NONE);
		zip.setText("Zip:");
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				
		// Strasse
		Label street = new Label(this, SWT.NONE);
		street.setText("Street:");
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				
		//Str. Nr
		Label nr = new Label(this, SWT.NONE);
		nr.setText("Street:");
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				
		// Tel
		Label tel = new Label(this, SWT.NONE);
		tel.setText("Tel.:");
		text = new Text(this, SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				
		// Arrival
		Label arrivalDate = new Label(this, SWT.NONE);
		arrivalDate.setText("Arrival Date.:");
		DateTime dateFrom = new DateTime(this, SWT.BORDER | SWT.DATE | SWT.DROP_DOWN);
		dateFrom.setDate(2012, 0, 1);
				
		// Arrivaltime
		Label arrivalTime = new Label(this, SWT.NONE);
		arrivalTime.setText("Arrival Time.:");
		DateTime timeEntry = new DateTime(this, SWT.TIME);
				
		// Leaving
		Label leavingDate = new Label(this, SWT.NONE);
		leavingDate.setText("Leaving Date.:");
		dateFrom = new DateTime(this, SWT.BORDER | SWT.DATE | SWT.DROP_DOWN);
		dateFrom.setDate(2012, 0, 1);
				
		// payment
		Label cabs = new Label(this, SWT.NONE);
		cabs.setText("Payment:");
		Combo combo = new Combo (this, SWT.READ_ONLY);
		combo.setItems (new String [] {"Cash", "Visa", "Mastercard", "Prepaid"});
		combo.select(0);
				
		// Stornodeadline
		Label storno = new Label(this, SWT.NONE);
		storno.setText("Storno expiration:");
		dateFrom = new DateTime(this, SWT.BORDER | SWT.DATE | SWT.DROP_DOWN);
		dateFrom.setDate(2012, 0, 1);
		
		// Check-In
		Button submit = new Button (this, SWT.PUSH);
		submit.setText ("Check-In");
				
		// Create Reservation
		Button reservationC = new Button (this, SWT.PUSH);
		reservationC.setText ("Create reservation");
		
		Listener buttonListener = new Listener() {
		      public void handleEvent(Event event) {
		    	  System.out.println("Test");
		    	  dialog.open();
		      }
		    };
		reservationC.addListener(SWT.Selection, buttonListener);
		
		
		// Storno
		Button stornoB = new Button (this, SWT.PUSH);
		stornoB.setText ("Cancel");
		
		// Save
		Button save = new Button (this, SWT.PUSH);
		save.setText ("Save Changes");
	}

}
