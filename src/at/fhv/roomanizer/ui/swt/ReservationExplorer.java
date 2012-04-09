package at.fhv.roomanizer.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;


public class ReservationExplorer extends Composite{

	public ReservationExplorer(Composite parent, int style) {
		super(parent, style);
		
		GridLayout layout = new GridLayout();
	    layout.numColumns = 1;
	    layout.makeColumnsEqualWidth = false;
	  
	    this.setLayout(layout);
		initUI();
	}

	private void initUI() {
		//Add the Filters at the top
		ReservationFilters filter = new ReservationFilters(this, SWT.NONE);
		
		//Add the Table
		ReservationTable rTable = new ReservationTable(this, SWT.NONE);
	}

}
