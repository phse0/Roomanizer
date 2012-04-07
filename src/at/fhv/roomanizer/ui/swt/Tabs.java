package at.fhv.roomanizer.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

public class Tabs extends Composite {
	
	private Display display;
	
	public Tabs(Composite parent, int style){
		super(parent, style);
		display = Display.getDefault();
		this.setLayout(new FillLayout());
		initUI();
	}
	
	private void initUI(){
		createTabs();
	}

	private void createTabs() {
		CTabFolder tabFolder = new CTabFolder(this,SWT.None);
		tabFolder.setSimple(false);
		
		tabFolder.setSelectionBackground(new Color[] {
        display.getSystemColor(SWT.COLOR_WHITE),
        display.getSystemColor(SWT.COLOR_WHITE),
        display.getSystemColor(SWT.COLOR_WHITE) }, new int[] { 80, 100 });

		CTabItem tb_itemDB = new CTabItem(tabFolder, SWT.NONE);
		tb_itemDB.setText("Dashboard");
		Dashboard db = new Dashboard(tabFolder, SWT.NONE);
		tb_itemDB.setControl(db);

		CTabItem tb_itemRV = new CTabItem(tabFolder, SWT.NONE);
		tb_itemRV.setText("Reservator");
	}
}
