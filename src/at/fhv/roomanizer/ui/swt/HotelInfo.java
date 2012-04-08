package at.fhv.roomanizer.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class HotelInfo extends Composite{

	public HotelInfo(Composite parent, int style) {
		super(parent, style);
		this.setLayout(new GridLayout(2, true));
		initUI();
	}

	private void initUI() {
		
		// Create Title
		Label title = new Label(this, SWT.NONE);
		title.setText("Hotelinformation");
		GridData data = new GridData(GridData.BEGINNING, GridData.CENTER, true, false, 2, 1);
		title.setLayoutData(data);
		
		// Create a new label which is used as a separator
		// Use GridData to span it over the 2 columns
		Label separtor = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		data = new GridData(GridData.FILL, GridData.BEGINNING, true, false, 2, 1);
		data.horizontalSpan=2;
		separtor.setLayoutData(data);
		
		// Hotelname
		Label name = new Label(this, SWT.NONE);
		name.setText("Name:");
		Text text = new Text(this,SWT.READ_ONLY | SWT.BORDER);
		text.setText("Mustername");
		text.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		
		// Hotel Tel. Nr
		Label telNr = new Label(this, SWT.NONE);
		telNr.setText("Tel.:");
		text = new Text(this,SWT.READ_ONLY | SWT.BORDER);
		text.setText("0800 / 4711 0815");
		text.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		
		// Street
		Label street = new Label(this, SWT.NONE);
		street.setText("Street:");
		text = new Text(this,SWT.READ_ONLY | SWT.BORDER);
		text.setText("Musterstra§e");
		text.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		
		// Number
		Label number = new Label(this, SWT.NONE);
		number.setText("Nr.:");
		text = new Text(this,SWT.READ_ONLY | SWT.BORDER);
		text.setText("15");
		text.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		
		// Website
		Label hp = new Label(this, SWT.NONE);
		hp.setText("Homepage:");
		text = new Text(this,SWT.READ_ONLY | SWT.BORDER);
		text.setText("www.roomanizer.at");
		text.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
	}

}
