package at.fhv.roomanizer.ui.swt.reservationexplorer;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import at.fhv.roomanizer.ui.swt.wizards.ReservationWizard;


public class ReservationDetailView extends Composite {

	Composite _parent;
	Shell _shell;

	public ReservationDetailView(Composite parent, int style) {
		super(parent, style);
		_shell = parent.getShell();

		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.makeColumnsEqualWidth = false;

		this.setLayout(layout);

		initUI();
	}

	private void initUI() {
		// Vorname
		Label fName = new Label(this, SWT.NONE);
		fName.setText("First name:");
		Text text = new Text(this, SWT.BORDER);
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

		// Str. Nr
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
		DateTime dateFrom = new DateTime(this, SWT.BORDER | SWT.DATE
				| SWT.DROP_DOWN);
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
		Combo combo = new Combo(this, SWT.READ_ONLY);
		combo.setItems(new String[] { "Cash", "Visa", "Mastercard", "Prepaid" });
		combo.select(0);

		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.verticalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = false;
		gridData.grabExcessVerticalSpace = false;
		gridData.horizontalSpan = 2;

		// Create Reservation
		Button reservationC = new Button(this, SWT.PUSH);
		reservationC.setText("Create reservation");
		reservationC.setLayoutData(gridData);

		Listener buttonListener = new Listener() {
			public void handleEvent(Event event) {
				WizardDialog dlg = new WizardDialog(_shell, new ReservationWizard());
				dlg.open();
			}
		};
		reservationC.addListener(SWT.Selection, buttonListener);

		// Check-In
		Button submit = new Button(this, SWT.PUSH);
		submit.setText("Check-In Reseration");
		submit.setLayoutData(gridData);

		// Save
		Button save = new Button(this, SWT.PUSH);
		save.setText("Save Reservation");
		save.setLayoutData(gridData);

		// Storno
		Button stornoB = new Button(this, SWT.PUSH);
		stornoB.setText("Cancel Reservation");
		stornoB.setLayoutData(gridData);
	}

}
