package at.fhv.roomanizer.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class Dashboard extends Composite{
	
	public Dashboard(Composite parent, int style) {		
		super(parent, style);
		
		GridLayout layout = new GridLayout();
	    layout.numColumns = 3;
	    layout.makeColumnsEqualWidth = false;
	  
	    this.setLayout(layout);

		initUI();
	}

	/**
	 * Creates the parts of the Dashboard userinterface
	 */
	private void initUI() {
		HotelInfo hotelinfo = new HotelInfo(this, SWT.NONE);
		hotelinfo.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_BOTH));
		
		RoomInfo roominfo = new RoomInfo(this, SWT.NONE);
		roominfo.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_BOTH));
		
		GuestInfo guestinfo = new GuestInfo(this, SWT.NONE);
		guestinfo.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_BOTH));
		
		HotelStats hotelstats = new HotelStats(this, SWT.NONE);
		hotelstats.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_BOTH));
		
		ExtraInfo extrainfo = new ExtraInfo(this, SWT.NONE);
		extrainfo.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_BOTH));
		
		Notes notes = new Notes(this, SWT.NONE);
		notes.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_BOTH));
	}
	
}
