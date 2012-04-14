package at.fhv.roomanizer.ui.swt.reservationexplorer;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class ReservationTable extends Composite {

	GridData data;
	
	public ReservationTable(Composite parent, int style) {
		super(parent, style);
		
		data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 400;
		this.setLayout(new GridLayout());
		initUI();
	}

	private void initUI() {
		
		Table table = new Table (this, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible (true);
		table.setHeaderVisible (true);
		table.setLayoutData(data);
		String[] titles = {"Reservation Number", "First Name", "Last Name", "Optiondate"};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (table, SWT.NONE);
			column.setText (titles [i]);
		}	
		int count = 128;
		for (int i=0; i<count; i++) {
			TableItem item = new TableItem (table, SWT.NONE);
			item.setText (0, "12345");
			item.setText (1, "John");
			item.setText (2, "Smith");
			item.setText (3, "07/07/2012");
			
		}
		for (int i=0; i<titles.length; i++) {
			table.getColumn (i).pack ();
		}	
		
	}

}
