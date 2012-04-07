package at.fhv.roomanizer.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Text;

public class HotelInfo extends Composite{

	public HotelInfo(Composite parent, int style) {
		super(parent, style);
		this.setLayout(new GridLayout(2, true));
		initUI();
	}

	private void initUI() {
		
		// Create a new label which is used as a separator
		// Use GridData to span it over the 2 columns
		Label separtor = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData data = new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1);
		data.horizontalSpan=2;
		separtor.setLayoutData(data);
		
		//Hotelname
		Label name = new Label(this, SWT.NONE);
		name.setText("Name");
		Text text = new Text(this,SWT.READ_ONLY | SWT.BORDER);
		text.setText("Mustername");
		
		//Hotel Tel. Nr
		Label telNr = new Label(this, SWT.NONE);
		telNr.setText("Tel.:");
		text = new Text(this,SWT.READ_ONLY | SWT.BORDER);
		text.setText("0800 / 4711 0815");
		
		//Street
		Label street = new Label(this, SWT.NONE);
		street.setText("Street:");
		text = new Text(this,SWT.READ_ONLY | SWT.BORDER);
		text.setText("Musterstra§e");
		
		//Number
		Label number = new Label(this, SWT.NONE);
		number.setText("Nr.:");
		text = new Text(this,SWT.READ_ONLY | SWT.BORDER);
		text.setText("15");
		
		//Website
		Label hp = new Label(this, SWT.NONE);
		hp.setText("Homepage:");
		Link link = new Link(this,SWT.NONE);
		link.setText("<A>www.roomanizer.at</A>");
		
		
	}

}
