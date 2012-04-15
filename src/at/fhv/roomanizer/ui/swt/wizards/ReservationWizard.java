package at.fhv.roomanizer.ui.swt.wizards;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ReservationWizard extends Wizard{
	
	public ReservationWizard() {
		addPage(new ReservationDecisionPage());
		addPage(new ThanksPage());
	}
	
	@Override
	public boolean performFinish() {
		return true;
	}
	
	class ReservationDecisionPage extends WizardPage {
		private Button yes;
		private Button no;

		public ReservationDecisionPage() {
			super("Reservation Type");
		}

		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			composite.setLayout(new GridLayout(2, true));

			new Label(composite, SWT.LEFT).setText("Choose the type of Reservation you want");
			Composite yesNo = new Composite(composite, SWT.NONE);
			yesNo.setLayout(new FillLayout(SWT.VERTICAL));

			yes = new Button(yesNo, SWT.RADIO);
			yes.setText("Standard Reservation");

			no = new Button(yesNo, SWT.RADIO);
			no.setText("Group Reservation");

			setControl(composite);
		}

		public IWizardPage getNextPage() {
			if (yes.getSelection()) {
				return super.getNextPage();
			}
			return getWizard().getPage("Thanks");
		}
	}
	
	class ThanksPage extends WizardPage {
		public ThanksPage() {
			super("Thanks");
		}

		public void createControl(Composite parent) {
			Label label = new Label(parent, SWT.CENTER);
			label.setText("Thanks!");
			setControl(label);
		}
	}

}
