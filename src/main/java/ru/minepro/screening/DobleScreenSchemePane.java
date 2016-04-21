package ru.minepro.screening;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import ru.minepro.interfaces.Process;
import ru.minepro.interfaces.VisiblePane;
import ru.minepro.schemeunit.DoubleScreenPane;

public class DobleScreenSchemePane extends DoubleScreenPane {

	private DoubleScreening doubleScreening;

	public DobleScreenSchemePane() {
		super("Грох. 2-ситное");

		this.setId("schemeUnit");
		this.setFocusTraversable(true);

		initListeners();

	}

	public void initListeners() {

		this.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				requestFocus();
				System.out.println("Грох. 2-ситное " + doubleScreening.getQh());

				VisiblePane ss = (VisiblePane) DobleScreenSchemePane.this;

			}
		});

	}

	public DoubleScreening getDoubleScreening() {
		return doubleScreening;
	}

	public void setDoubleScreening(DoubleScreening doubleScreening) {
		this.doubleScreening = doubleScreening;
	}

	@Override
	public Process getPaneProcess() {
		return doubleScreening;
	}

} // class end
