package uebung5;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

public class Controller {
	private View view;
	private Model model = new Model();
	private Action action = new SwingAction();
	private Action action_1 = new SwingAction_1();
	private Action action_2 = new SwingAction_2();
	private Action action_3 = new SwingAction_3();

	public Controller() {
		this.view = new View();
		this.model.initiate();
	}

	public void showView() {
		view.setVisible(true);

		view.list.setListData(model.makeVektor(model.bib.buecher));
		view.btnNewButton_1.setAction(action);
		view.btnNewButton.setAction(action_1);
		view.button.setAction(action_2);
		view.send.setAction(action_3);
	}

	class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Autor");
			putValue(SHORT_DESCRIPTION, "Nach Autor sortieren");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			view.list.setListData(model.makeVektor(model.bib
					.bestandSortierenNach(new comparatorByAutor())));

		}
	}

	class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Titel");
			putValue(SHORT_DESCRIPTION, "Nach Titel sortieren");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			view.list.setListData(model.makeVektor(model.bib
					.bestandSortierenNach(new comparatorByTitle())));
		}
	}

	class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "ISBN");
			putValue(SHORT_DESCRIPTION, "Nach ISBN sortieren");
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			view.list.setListData(model.makeVektor(model.bib
					.bestandSortierenNach(new comparatorByIsbn())));
		}
	}

	class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Einfügen");
			putValue(SHORT_DESCRIPTION, "Buch Einfügen");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Buch b = new Buch(view.frmtdtxtfldIsbn.getText(),
					view.frmtdtxtfldAutor.getText(),
					view.frmtdtxtfldTitel.getText());
			model.bib.einfuegen(b);
			view.list.setListData(model.makeVektor(model.bib.buecher));
		}
	}
}
