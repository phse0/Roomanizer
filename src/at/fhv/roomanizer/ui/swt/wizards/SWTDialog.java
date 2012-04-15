package at.fhv.roomanizer.ui.swt.wizards;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public class SWTDialog extends Dialog {
	
	Object _result;


	public SWTDialog(Shell parent, int style) {
		super(parent, style);
	}

	public SWTDialog(Shell parent) {
		this(parent, 0); // your default style bits go here (not the Shell's style bits)
	}

	public Object open() {
		Shell parent = getParent();
		final Shell shell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
		shell.setText(getText());
		
		shell.setText("Delete File");
		shell.setSize(250, 150);
		
		// Your code goes here (widget creation, set result, etc).
		final Button buttonOK = new Button(shell, SWT.PUSH);
	    buttonOK.setText("OK");
	    buttonOK.setBounds(20, 55, 80, 25);

	    Button buttonCancel = new Button(shell, SWT.PUSH);
	    buttonCancel.setText("Cancel");
	    buttonCancel.setBounds(120, 55, 80, 25);
	    
	    Label label = new Label(shell, SWT.NONE);
	    label.setText("Delete the file?");
	    label.setBounds(20, 15, 100, 20);
		
		shell.open();
		
		Listener listener = new Listener() {
	    	@Override
	        public void handleEvent(Event event) {
	          if (event.widget == buttonOK) {
	            System.out.println("You klicked ok");
	          } else {
	           System.out.println("You klicked cancle");
	          }
	          shell.close();
	        }
	      };
	      
	    buttonOK.addListener(SWT.Selection, listener);
	    buttonCancel.addListener(SWT.Selection, listener);
		
		Display display = parent.getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		return _result;
	}
}
