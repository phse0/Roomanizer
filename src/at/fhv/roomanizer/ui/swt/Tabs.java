package at.fhv.roomanizer.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

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
		/**
		 * Creating a tabmenu
		 */
		CTabFolder tabMenu = new CTabFolder(this,SWT.None);
		tabMenu.setSimple(false);
		
		tabMenu.setSelectionBackground(new Color[] {
        display.getSystemColor(SWT.COLOR_WHITE),
        display.getSystemColor(SWT.COLOR_WHITE),
        display.getSystemColor(SWT.COLOR_WHITE) }, new int[] { 80, 100 });

		/**
		 * Creating the tab items
		 * Composites are added to the tab items
		 * tabMenu is the parent for the Composites
		 */
		 
		/** 
		 * Dashboard composite
		 */
		CTabItem tb_itemDB = new CTabItem(tabMenu, SWT.NONE);
		tb_itemDB.setText("Dashboard");
		Dashboard db = new Dashboard(tabMenu, SWT.NONE);
		tb_itemDB.setControl(db);
		
		/**
		 * Reservator composite 
		 */
		CTabItem tb_itemRV = new CTabItem(tabMenu, SWT.NONE);
		tb_itemRV.setText("Reservator");
		

		/**
		 * Explorer composite 
		 */
		CTabItem tb_itemEx = new CTabItem(tabMenu, SWT.NONE);
		tb_itemEx.setText("Explorer");

	}
}
