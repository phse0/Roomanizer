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
		
		/*
		GridLayout layout = new GridLayout();
	    layout.numColumns = 3;
	    layout.makeColumnsEqualWidth = true;
	    this.setLayout(layout);
	    */
		
		initUI();
	}

	private void initUI() {
		
	}
	
}
