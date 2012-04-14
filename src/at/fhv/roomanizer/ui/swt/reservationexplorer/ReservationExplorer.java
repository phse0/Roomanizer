package at.fhv.roomanizer.ui.swt.reservationexplorer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class ReservationExplorer extends Composite{

	public ReservationExplorer(Composite parent, int style) {
		super(parent, style);
		
		GridLayout layout = new GridLayout();
	    layout.numColumns = 2;
	    layout.makeColumnsEqualWidth = false;
	  
	    this.setLayout(layout);
		initUI();
	}

	private void initUI() {
		//Add the Filters at the top
		ReservationFilters filter = new ReservationFilters(this, SWT.NONE);
		GridData data = new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1);
		data.horizontalSpan=2;
		filter.setLayoutData(data);
		
		//Add the Table
		ReservationTable rTable = new ReservationTable(this, SWT.NONE);
		
		//Add the DetailView of a Reservation
		ReservationDetailView details = new ReservationDetailView(this, SWT.NONE);
		details.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
	}

}
