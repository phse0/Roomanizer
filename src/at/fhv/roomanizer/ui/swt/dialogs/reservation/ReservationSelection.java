package at.fhv.roomanizer.ui.swt.dialogs.reservation;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

import at.fhv.roomanizer.ui.swt.dialogs.SWTDialog;

public class ReservationSelection extends Composite {

	Shell _shell;
	List<Composite> _dialogViews;
	ReservationDialog _dialog;

	public ReservationSelection(Shell shell, int style,
			List<Composite> dialogViews, ReservationDialog dialog) {
		super(shell, 0);
		this._shell = shell;
		_dialog = dialog;
		_dialogViews = dialogViews;

		initUI();
	}

	private void initUI() {

		// Infotext
		Label info = new Label(_shell, SWT.NONE);
		info.setText("Please choose the type of reservation.");

		Button button = new Button(_shell, SWT.RADIO);
		button.setText("Standard Reservation");
		button.setSelection(true);

		button = new Button(_shell, SWT.RADIO);
		button.setText("Group Reservation");
		button.setSelection(false);

		Button nextButton = new Button(_shell, SWT.PUSH);
		nextButton.setText("Next Step");
		Button cancleButton = new Button(_shell, SWT.PUSH);
		cancleButton.setText("Cancle");

		Listener nextListener = new Listener() {
			public void handleEvent(Event event) {
				Control[] children = _shell.getChildren();
				int selection = 0;

				// Check which radiobox is selected
				for (int i = 0; i < children.length; i++) {
					Control child = children[i];
					if (child instanceof Button
							&& (child.getStyle() & SWT.RADIO) != 0) {
						if (((Button) child).getSelection()) {
							selection = i;
							break;
						}
					}
				}

				// Choose the next view of the dialog, and tell the dialog to
				// take the next step
				_dialogViews.add(new ReservationSelection(_shell, 0, _dialogViews, _dialog));
				_dialog.nextView();
			}
		};

		Listener cancleListener = new Listener() {
			public void handleEvent(Event event) {
				_shell.setVisible(false);
			}
		};

		nextButton.addListener(SWT.Selection, nextListener);
		cancleButton.addListener(SWT.Selection, cancleListener);

	}

}
