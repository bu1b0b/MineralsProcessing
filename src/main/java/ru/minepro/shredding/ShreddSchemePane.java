package ru.minepro.shredding;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import ru.minepro.interfaces.Process;
import ru.minepro.schemeunit.CrushShredPane;

public class ShreddSchemePane extends CrushShredPane {

	// TODO доработать панель измельчения

	private Shredding shredding;

	public ShreddSchemePane() {
		super("Измельчение");

		this.setId("schemeUnit");
		this.setFocusTraversable(true);

		initListeners();

	}

	public void initListeners() {

		this.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				requestFocus();
				System.out.println(shredding.getProcessName());
			}
		});
	}

	public Shredding getShredding() {
		return shredding;
	}

	public void setShredding(Shredding shredding) {
		this.shredding = shredding;
	}

	@Override
	public Process getPaneProcess() {
		return shredding;
	}

} // class end
