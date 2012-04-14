package at.fhv.roomanizer.ui.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

import at.fhv.roomanizer.ui.swt.dashboard.Dashboard;
import at.fhv.roomanizer.ui.swt.reservationexplorer.ReservationExplorer;


public class MainShell {

	Shell _shell;
	Tabs _tab;
	
	public MainShell() {
		
		Display display = new Display();
		
		/**
		 * Setting up the main shell
		 */
		_shell = new Shell(display);
		_shell.setText("Roomanizer");
		_shell.setLayout(new FillLayout());
		_shell.setMinimumSize(1000, 600);

		/**
		 * Top Menu Part
		 */
	    Menu menuBar = new Menu(_shell, SWT.BAR);
	    MenuItem fileMenuHeader = new MenuItem(menuBar, SWT.CASCADE);
	    fileMenuHeader.setText("File");
	    
	    /**
		 *Tabs Part
		 */
		_tab = new Tabs(_shell, SWT.None);
		_shell.open();
		
		while (!_shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public static void main(String[] args){
		MainShell mainShell = new MainShell();	
	}
	
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
			 * Explorer composite 
			 */
			CTabItem tb_itemEx = new CTabItem(tabMenu, SWT.NONE);
			tb_itemEx.setText("Reservationexplorer");
			ReservationExplorer re = new ReservationExplorer(tabMenu, SWT.NONE);
			tb_itemEx.setControl(re);

		}
	}
	
	private class Tab extends Composite {
		
		private Display display;
		
		public Tab(Composite parent, int style){
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
			Reservator rv = new Reservator(tabMenu, SWT.NONE);
			tb_itemRV.setControl(rv);
			
			/**
			 * Explorer composite 
			 */
			CTabItem tb_itemEx = new CTabItem(tabMenu, SWT.NONE);
			tb_itemEx.setText("Reservationexplorer");
			ReservationExplorer re = new ReservationExplorer(tabMenu, SWT.NONE);
			tb_itemEx.setControl(re);

		}
	}
	
}
